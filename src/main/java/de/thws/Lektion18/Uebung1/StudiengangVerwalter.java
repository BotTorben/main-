package de.thws.Lektion18.Uebung1;

import java.io.*;

public class StudiengangVerwalter {

    public static void splitStudiengaenge(String dateiname) throws IOException, MatrikelNummerException {
        try(
                BufferedReader bfr = new BufferedReader(new FileReader(dateiname));
                BufferedWriter winfWr = new BufferedWriter(new FileWriter("WInf.txt"));
                BufferedWriter infWr = new BufferedWriter(new FileWriter("InfNr.txt"));
                BufferedWriter ecWr = new BufferedWriter(new FileWriter("ECNr.txt"));
        ){
            String zeile;
            while ((zeile = bfr.readLine()) != null){
                try{
                    int nummer = Integer.valueOf(zeile);

                    if (nummer >= 5000000 && nummer <= 5099999) {
                        winfWr.write(zeile);
                        winfWr.newLine();
                    } else if (nummer >= 5100000 && nummer <= 5199999) {
                        infWr.write(zeile);
                        infWr.newLine();
                    } else if (nummer >= 6100000 && nummer <= 6199999) {
                        ecWr.write(zeile);
                        ecWr.newLine();
                    } else {

                        throw new MatrikelNummerException("Ungültige Matrikelnummer außerhalb der Bereiche: " + nummer);
                    }
                } catch (NumberFormatException e){
                    throw new MatrikelNummerException("Formatfehler in der Datei: " + zeile);
                }
            }

        }
    }
}
