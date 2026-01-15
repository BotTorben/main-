package de.thws.Lektion22.Uebung2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        List<Integer> liste1 = List.of(341, 2, 17, 10);
        List<Integer> liste2 = List.of(633910099, 99, 5, 42);

        PrimzahlThread t1 = new PrimzahlThread(liste1);
        PrimzahlThread t2 = new PrimzahlThread(liste2);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        Map<Integer, Boolean> gesamtErgebnis = new HashMap<>();

        gesamtErgebnis.putAll(t1.getPrimzahlMap());
        gesamtErgebnis.putAll(t2.getPrimzahlMap());

        System.out.println("--- Ergebnisse ---");
        for (Map.Entry<Integer, Boolean> entry : gesamtErgebnis.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
