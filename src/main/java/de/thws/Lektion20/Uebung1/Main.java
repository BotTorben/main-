package de.thws.Lektion20.Uebung1;

import java.util.*;

public class Main {
    public static void main(String[]args){
        List<Karte> Deck= new ArrayList<>();

        for(Farbe f : Farbe.values()){
            for(Wert w : Wert.values()){
                Deck.add(new Karte(f,w));
            }
        }

        Collections.shuffle(Deck);

        Set<Karte> hand = new HashSet<>();
        Spieler sp1 = new Spieler(hand, "Jannis");

        for (int i = 0; i < 5; i++){
            Karte gezogeneKarte = Deck.remove(0);
            sp1.nehmeKarte(gezogeneKarte);
        }

        System.out.println(sp1.zeigeHand());
    }
}
