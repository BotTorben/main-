package de.thws.KlausurUebungen.RemoteMathServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MathClient {

    public static void main(String[]args){
        final int PORT = 5555;
        final String HOST = "localhost";

        try(Socket conenctionToServer = new Socket(HOST, PORT);
            BufferedReader sysIn = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(conenctionToServer.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(conenctionToServer.getInputStream()));)
            {

                String input;
                while((input = sysIn.readLine()) != null) {
                    pw.println(input);
                    System.out.println("Nachricht geschickt.");
                    System.out.println("Server antwortet: " + br.readLine());
                }
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
