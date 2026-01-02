package de.thws.Lektion18.Uebung2;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        final int PORT = 5000;
        final String HOST = "localhost";
        try(Socket connectionToServer = new Socket(HOST, PORT);
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(connectionToServer.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(connectionToServer.getInputStream()));)
        {
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput); // Senden an Server
                System.out.println("Server antwortet: " + in.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
