package de.thws.Lektion20.Uebung2;

import de.thws.Lektion20.Uebung1.Farbe;
import de.thws.Lektion20.Uebung1.Wert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScatSpiel {

    public static void main(String[] args) {
        // Deck erstellen
        List<Karte> deck = new ArrayList<>();
        for (Farbe f : Farbe.values()) {
            for (Wert w : Wert.values()) {
                deck.add(new Karte(f, w));
            }
        }

        // Mischen
        Collections.shuffle(deck);

        // 10 Karten ziehen (Skat Hand)
        List<Karte> hand = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            hand.add(deck.get(i));
        }

        System.out.println("--- Unsortierte Hand ---");
        for(Karte k : hand) System.out.println(k);

        // Sortieren (ruft automatisch unsere compareTo Methode auf)
        Collections.sort(hand);

        System.out.println("\n--- Sortierte Hand (Skat-Regel) ---");
        for(Karte k : hand) System.out.println(k);
    }
}
