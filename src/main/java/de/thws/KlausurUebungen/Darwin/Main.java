package de.thws.KlausurUebungen.Darwin;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String dateiName = "test";
        List<Lebewesen> darwin = Arrays.asList(new Mensch("Max", "Pilot"), new Tier("Bob", "Bobcat"), new Mensch("Maxine", "CEO"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dateiName))) {

            oos.writeObject(darwin);
            System.out.println("Objekte erfolgreich gespeichert.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Starte Laden ---");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dateiName))) {

            List<Lebewesen> geladeneListe = (List<Lebewesen>) ois.readObject();

            for (Lebewesen l : geladeneListe) {
                l.beschreibe();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
