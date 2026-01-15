package de.thws.Lektion22.Uebung3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TcpServerThread{

    public static void main(String[] args) {
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server gestartet auf Port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Neue Verbindung angenommen: " + clientSocket.getInetAddress());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            // Streams öffnen (Try-with-resources schließt Socket am Ende automatisch)
            try (
                    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(socket.getInputStream())
            ) {
                // b) Liste von Zahlen empfangen
                // Wir müssen casten, da readObject() ein allgemeines Object liefert
                List<Integer> zahlen = (List<Integer>) in.readObject();
                System.out.println("Thread " + this.getId() + " hat Daten erhalten: " + zahlen);

                // Verarbeitung: Primzahlcheck
                Map<Integer, Boolean> ergebnis = new HashMap<>();
                for (Integer zahl : zahlen) {
                    ergebnis.put(zahl, isPrime(zahl));
                }

                // Simulieren wir kurz Arbeit, damit wir Parallelität beweisen können
                Thread.sleep(2000);

                // Antwort zurücksenden
                out.writeObject(ergebnis);
                out.flush(); // Sicherstellen, dass Daten rausgehen

                System.out.println("Thread " + this.getId() + " fertig.");

            } catch (IOException | ClassNotFoundException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Sicherstellen, dass der Socket zugeht, falls try-with-resources nicht greift
                try { socket.close(); } catch (IOException e) {}
            }
        }

        // Hilfsmethode für Primzahlen
        private boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}

