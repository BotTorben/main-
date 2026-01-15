package de.thws.KlausurUebungen.Dateisuche;

import java.io.*;

public class Finder {
    public BufferedReader getSystemInAsBufferedReader() {
// Teilaufgabe a
        return new BufferedReader(new InputStreamReader(System.in));
    }
    public void findStringInFiles(String searchString,
                                  String[] filenames)   {
// Teilaufgabe b
        for (String file : filenames) {

            // Wir nutzen den Zeilenzähler, um dem Nutzer zu sagen, WO wir was gefunden haben
            int lineNumber = 1;

            // 2. Datei öffnen (Try-with-resources schließt den Reader automatisch am Ende)
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                // 3. Zeile für Zeile lesen, bis das Ende der Datei (null) erreicht ist
                while ((line = br.readLine()) != null) {

                    // 4. Prüfen: Enthält die aktuelle Zeile den Suchstring?
                    // Hinweis: .contains() ist case-sensitive (Groß-/Kleinschreibung wichtig)
                    if (line.contains(searchString)) {
                        // Treffer formatieren und ausgeben
                        System.out.println("Treffer in Datei '" + file + "' in Zeile " + lineNumber + ": " + line.trim());
                    }

                    lineNumber++; // Zähler erhöhen für den nächsten Durchlauf
                }

            } catch (IOException e) {
                // 5. Fehlerbehandlung: Wenn Datei nicht lesbar/vorhanden ist
                // Wir geben den Fehler aus, aber das Programm läuft weiter zur nächsten Datei (nächste Schleifen-Iteration)
                System.err.println("Konnte Datei nicht lesen: " + file);
            }
        }
    }
    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        };
    }
}