package de.thws.Lektion18.Uebung4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerKomprimiert {

    public static void main(String[] args){
        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream())))
            {
                String clientInput;
                while((clientInput = br.readLine()) != null){
                    System.out.println(clientInput);
                }
            }catch (Exception e){
                e.printStackTrace();
        }
    }
}
