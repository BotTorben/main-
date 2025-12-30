package de.thws.Lektion17.Uebung4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler extends OutputStream {

    public OutputStream os1;
    public OutputStream os2;

    public OutputStreamDoubler(OutputStream os1, OutputStream os2) {
        this.os1 = os1;
        this.os2 = os2;
    }

    @Override
    public void close() throws IOException {
        try {
            os1.close();
        } catch (IOException ioe){
            os2.close();
            throw new IOException("Fehler 'os1' hat eine Exception geworfen!");
        }
        try {
            os2.close();
        } catch (IOException ioe){
            os1.close();
            throw new IOException("Fehler 'os2' hat eine Exception geworfen!");
        }
    }

    @Override
    public void write(int b) throws IOException {
        try {
            os1.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            os2.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            FileOutputStream fos1 = new FileOutputStream("file1.txt");
            FileOutputStream fos2 = new FileOutputStream("file2.txt");

            OutputStreamDoubler doubler = new OutputStreamDoubler(fos1, fos2);

            byte[] data = "Hello Stream".getBytes();
            for (byte b : data) {
                doubler.write(b);
            }

            System.out.println("Daten erfolgreich in beide Dateien geschrieben.");
            doubler.close();
            fos1.close();
            fos2.close();

        } catch (IOException e) {
            System.err.println("Ein Fehler ist aufgetreten: " + e.getMessage());
        }
    }
}