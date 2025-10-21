package Week_6_Set_1;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client connection...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Welcome to the Java Workshop!");

            System.out.println("Message sent to client.");
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
