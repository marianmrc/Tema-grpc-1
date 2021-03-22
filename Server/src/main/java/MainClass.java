import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.DataProcessingImpl;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        try {
            Server server = ServerBuilder.forPort(8000).addService(new DataProcessingImpl()).build();

            server.start();
            System.out.println("Server started at " + server.getPort());

            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
