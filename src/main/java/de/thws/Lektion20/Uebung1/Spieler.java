package de.thws.Lektion20.Uebung1;

import java.util.HashSet;
import java.util.Set;

public class Spieler {

    private Set<Karte> hand = new HashSet<>();
    private String name;

    public Spieler(Set<Karte> hand,String name) {
        this.name = name;
        this.hand = hand;
    }

    public void nehmeKarte(Karte k){
        hand.add(k);
    }

    public String zeigeHand(){
        String karten = "";
        for(Karte k : hand){
            karten += k.toString();
            karten += "\n";
        }
        return karten;
    }
}
