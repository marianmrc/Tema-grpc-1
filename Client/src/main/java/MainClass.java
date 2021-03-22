import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Client;
import proto.DataProcessingGrpc;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).usePlaintext().build();
        DataProcessingGrpc.DataProcessingBlockingStub dataStub = DataProcessingGrpc.newBlockingStub(channel);

        while (true) {
            Scanner readData = new Scanner(System.in);
            System.out.println("Nume: ");
            String name = readData.nextLine();
            System.out.println("Cnp: ");
            String cnp = readData.next();

            Client.DataResponse response = dataStub.processData(Client.DataRequest.newBuilder().setName(name).setCnp(cnp).build());
            System.out.println(response.getResponse());

            System.out.println("Exit program?");
            String yesOrNo = readData.next();
            if (yesOrNo.equals("yes")) {
                channel.shutdown();
                System.exit(0);
            }
            else {
                System.out.println("Remain connected");
            }
        }
    }
}
