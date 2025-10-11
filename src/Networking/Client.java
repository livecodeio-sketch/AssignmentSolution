package Networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connected with Server");

        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println("This is from Client");

        Scanner scanner = new Scanner(socket.getInputStream());
        System.out.println("Server: "+scanner.nextLine());

        socket.close();

    }
}
