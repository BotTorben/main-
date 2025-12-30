package de.thws.Lektion17.Uebung3;

import java.io.*;
import java.util.Scanner;

import static de.thws.Lektion17.Uebung3.copyDatei.*;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Nenne den Name, den du kopieren möchtest: ");
        String file = s1.nextLine();
        System.out.println("Nenne den neuen Namen deiner kopierten Datei: ");
        String newName = s1.nextLine();
        try (FileInputStream is = new FileInputStream(file);
             FileOutputStream os = new FileOutputStream(newName);) {
            //copyOhnePuffer(is, os);
            //copyMitPuffer(is, os);
            copyOhnePuffer1024(is, os);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());
    }
}
