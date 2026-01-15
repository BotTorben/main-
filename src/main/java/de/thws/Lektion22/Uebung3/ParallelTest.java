package de.thws.Lektion22.Uebung3;

import java.util.List;

public class ParallelTest {

    public static void main(String[] args) {
        // Starte Client 1 in einem Thread
        new Thread(() -> {
            TcpClientThread c1 = new TcpClientThread();
            c1.sendeAnfrage(List.of(3, 5, 7)); // Primzahlen
        }).start();

        // Starte Client 2 in einem Thread (gleichzeitig!)
        new Thread(() -> {
            TcpClientThread c2 = new TcpClientThread();
            c2.sendeAnfrage(List.of(4, 6, 8)); // Keine Primzahlen
        }).start();

        System.out.println("Beide Clients gestartet...");
    }
}
