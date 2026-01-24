package de.thws.KlausurUebungen.WOW;

public class Held extends Charakter{

    public String rasse;

    public Held(String name, int trefferpunkte, String rasse){
        super(name, trefferpunkte);
        this.rasse = rasse;
    }
}
