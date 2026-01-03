package de.thws.Lektion18.Uebung4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientKomprimiert {

    public static void main(String[] args) throws IOException {
        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        try(Socket connectionToHost = new Socket("localhost", 5000);
            OutputStream os = connectionToHost.getOutputStream();)
        {
            os.write(bytesToTransfer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
