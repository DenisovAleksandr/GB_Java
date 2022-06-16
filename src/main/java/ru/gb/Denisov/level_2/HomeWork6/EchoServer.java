package ru.gb.Denisov.level_2.HomeWork6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        try {
            new EchoServer().start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8289)) {
            System.out.println("Waiting client connection...");
            Socket socket = serverSocket.accept();
            System.out.println("Client is connect");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            openConnection();
        }
    }

    private void openConnection() {
        new Thread(() -> {
            try {
                while (true) {
                    String message = in.readUTF();
                    System.out.println("Message from client: " + message);
                    if (message.equalsIgnoreCase("/end")) {
                        sendMassage(message);
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String nextMessage = scanner.nextLine();
                sendMassage(nextMessage);
            }
        });
    }

    private void sendMassage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
