package Networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started waiting for client");

        Socket socket = server.accept();
        System.out.println("Connection Established");

        Scanner scanner = new Scanner(socket.getInputStream());
        System.out.println("Client mag: "+scanner.nextLine());

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("This is from Server");

        scanner.close();
        socket.close();
        server.close();

        // socket - connection
        // ip - Address on the internet
        // port - name for app
    }
}
