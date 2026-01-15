package de.thws.Lektion23.Uebung2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; // Import nicht vergessen!
import java.util.List;

public class LambdaComarator {
    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();
        namen.add("Zelda");
        namen.add("Mario");
        namen.add("Luigi");

        // --- Die "alte" Weise (Anonyme Klasse) ---
        // Nur zum Vergleich (das musst du nicht schreiben):
        /*
        Collections.sort(namen, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        */

        // --- Die "neue" Weise (Lösung Aufgabe a) ---
        // Der Compiler weiß, dass sort einen Comparator braucht.
        // Ein Comparator hat genau eine Methode: int compare(T o1, T o2).
        // (s1, s2) sind die Parameter, s1.compareTo(s2) ist der Rumpf.

        namen.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(namen);
    }
}