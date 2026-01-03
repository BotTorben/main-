package de.thws.Lektion18.Uebung4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

public class TcpServerKomprimiert {

    public static void main(String[] args) {
        final int PORT = 5000;
        try (ServerSocket ss = new ServerSocket(PORT);
             Socket connection = ss.accept();
             InputStream is = connection.getInputStream();
             GZIPInputStream gis = new GZIPInputStream(is);
             InputStreamReader isr = new InputStreamReader(gis);
             BufferedReader br = new BufferedReader(isr))
        {
            String clientInput;
            while ((clientInput = br.readLine()) != null) {
                System.out.println(clientInput);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}