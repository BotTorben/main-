package de.thws.Lektion18.Uebung2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        final int PORT = 5000;
        final String[] woerter = {"Informatik","Programmieren","test"};
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            PrintWriter out = new PrintWriter(connection.getOutputStream(), true))
        {
            String inputline;
            String wort = "";

            for(int i = woerter[2].length(); i > 0; i--){
                wort += "_";
            }
            char[] wortCh = wort.toCharArray();
            while((inputline = in.readLine()) != null){
                System.out.println("Empfangene Zeichen: " + inputline);
                char geratenerBuchstabe = inputline.charAt(0);
                for (int i = 0; i < wortCh.length; i++){
                    if (geratenerBuchstabe == woerter[2].charAt(i)){
                        wortCh[i] = geratenerBuchstabe;
                    }
                }
                out.println("Zu erratendes Wort: " + String.valueOf(wortCh));
                if(String.valueOf(wortCh).equals(woerter[2])){
                    out.write("Du hast Gewonnen. Das Wort war: " +  String.valueOf(wortCh));
                    return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
