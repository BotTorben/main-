package de.thws.Lektion22.Uebung3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Map;

public class TcpClientThread {

    public void sendeAnfrage(List<Integer> zahlenToSend) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port);
             // WICHTIG: Output Stream immer ZUERST erstellen, sonst können sich Server/Client blockieren!
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

            System.out.println("Client sendet: " + zahlenToSend);

            // Senden
            out.writeObject(zahlenToSend);
            out.flush();

            // Auf Antwort warten (blockiert, bis Server fertig ist)
            Map<Integer, Boolean> antwort = (Map<Integer, Boolean>) in.readObject();

            System.out.println("Client hat Antwort erhalten: " + antwort);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main Methode für manuellen Einzel-Test
    public static void main(String[] args) {
        new TcpClientThread().sendeAnfrage(List.of(13, 4, 19, 100));
    }
}
