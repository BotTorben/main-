package de.thws.Lektion23.Uebung1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args){
        List<Mannschaft> m1 = Mannschaft.createTabelle();

        System.out.println("Mannschaften mit mehr als 50 Punkten: ");
        m1.stream()
                .filter(m -> m.punkte > 50)
                .forEach(m-> System.out.println(m));
        System.out.println();


        System.out.println("Alles Mannschaftsnamen: ");
        m1.stream().forEach(m -> System.out.println(m.name));
        System.out.println();


        System.out.println("Alle Mannschaften, die mit F beginnen: ");
        m1.stream()
                .filter(m -> m.name.startsWith("F"))
                .sorted()
                .forEach(m -> System.out.println(m.name));
        System.out.println();

        System.out.println("Die Mannschaft mit den Meist geschossenen Toren: ");
        Optional<Mannschaft> schiessbude = m1.stream()
                .max((m3, m4) -> m3.gegentore - m4.gegentore);
        System.out.println(schiessbude.get().toString());
    }
}
