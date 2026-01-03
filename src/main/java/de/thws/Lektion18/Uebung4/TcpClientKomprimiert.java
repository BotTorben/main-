package de.thws.Lektion18.Uebung4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class TcpClientKomprimiert {

    public static void main(String[] args) throws IOException {
        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        try(Socket connectionToHost = new Socket("localhost", 5000);
            OutputStream os = connectionToHost.getOutputStream();
            GZIPOutputStream gzos = new GZIPOutputStream(os))
        {
            gzos.write(bytesToTransfer);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}