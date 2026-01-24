package de.thws.KlausurUebungen.RemoteMathServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{

    private Socket connection;

    public ClientHandler(Socket connection){
        this.connection = connection;
    }

    @Override
    public void run(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             PrintWriter pw = new PrintWriter(connection.getOutputStream(), true)) {

            String input;
            while ((input = br.readLine()) != null) {

                String[] parts = input.split(" ");
                String command = parts[0]; // z.B. "ADD"

                if (command.equals("EXIT")) {
                    pw.println("BYE");
                    break;
                }

                try {
                    if (parts.length < 3) {
                        pw.println("ERROR: Zu wenig Argumente");
                        continue;
                    }

                    int z1 = Integer.parseInt(parts[1]);
                    int z2 = Integer.parseInt(parts[2]);

                    switch (command) {
                        case "ADD":
                            pw.println("RESULT " + (z1 + z2));
                            break; // Wichtig!
                        case "SUB":
                            pw.println("RESULT " + (z1 - z2));
                            break; // Wichtig!
                        default:
                            pw.println("ERROR: Unbekannter Befehl");
                    }
                } catch (NumberFormatException e) {
                    pw.println("ERROR: Das waren keine Zahlen!");
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
