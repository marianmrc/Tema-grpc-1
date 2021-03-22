package service;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import proto.DataProcessingGrpc;
import proto.Server;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DataProcessingImpl extends DataProcessingGrpc.DataProcessingImplBase {
    @Override
    public void processData(Server.DataRequest request, StreamObserver<Server.DataResponse> responseObserver) {
        if (request.getCnp().length() == 7) {
            char gender = request.getCnp().charAt(0);
            String genderString = null;
            switch (gender) {
                case '1':
                case '5':
                    genderString = "Male";
                    break;
                case '2':
                case '6':
                    genderString = "Female";
                    break;
                default:
                    Status status = Status.NOT_FOUND.withDescription("Gender not exist!");
                    responseObserver.onError(status.asRuntimeException());
            }

            int year;
            switch (gender) {
                case '1':
                case '2':
                    year = Integer.parseInt(request.getCnp().substring(1, 3)) + 1900;
                    break;
                default:
                    year = Integer.parseInt(request.getCnp().substring(1, 3)) + 2000;
                    break;
            }

            int month;
            if (request.getCnp().charAt(3) != 0) {
                month = Integer.parseInt(request.getCnp().substring(3, 5));
            }
            else {
                month = Integer.parseInt(request.getCnp().substring(4, 5));
            }

            int day;
            if (request.getCnp().charAt(5) != 0) {
                day = Integer.parseInt(request.getCnp().substring(5, 7));
            }
            else {
                day = Integer.parseInt(request.getCnp().substring(6, 7));
            }

            Calendar now = Calendar.getInstance();
            now.setTimeInMillis(System.currentTimeMillis());

            int age = now.get(Calendar.YEAR) - year;
            if (now.get(Calendar.MONTH) - month + 1 < 0) {
                age -= 1;
            }
            if (now.get(Calendar.MONTH) - month == 0 && now.get(Calendar.DAY_OF_MONTH) - day < 0) {
                age -= 1;
            }

            System.out.println(request.getName() + " " + genderString + " " + age);

            Server.DataResponse response = Server.DataResponse.newBuilder().setResponse(request.getName() + " " + genderString + " " + age).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else {
            Status status = Status.OUT_OF_RANGE.withDescription("Invalid CNP length");
            responseObserver.onError(status.asRuntimeException());
        }
    }
}
