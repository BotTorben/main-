package de.thws.Lektion18.Uebung1;

import java.io.IOException;

import static de.thws.Lektion18.Uebung1.StudiengangVerwalter.*;

public class Main {
    public static void main(String[] args){
        String dateiname = "MatrNr.txt";

        try {
            splitStudiengaenge(dateiname);
            System.out.println("Dateien erfolgreich aufgeteilt.");
        } catch (MatrikelNummerException e) {
            // Spezifische Fehlermeldung ausgeben
            System.err.println("Fehler: " + e.getMessage());
        } catch (IOException e) {
            // Fehler beim Dateizugriff (z.B. Datei nicht gefunden)
            System.err.println("Dateisystem-Fehler: " + e.getMessage());
        }
    }
}
