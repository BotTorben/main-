package de.thws.KlausurUebungen.RemoteMathServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args){
        final int PORT = 5555;
        try(ServerSocket ss = new ServerSocket(PORT);){
            System.out.println("Server ist gestartet.");

            while(true){
                Socket connection = ss.accept();
                System.out.println("Client verbunden");
                ClientHandler ch = new ClientHandler(connection);
                Thread t1 = new Thread(ch);
                t1.start();
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
