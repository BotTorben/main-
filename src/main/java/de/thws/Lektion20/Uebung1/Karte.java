package de.thws.Lektion20.Uebung1;

public class Karte {
    private final Farbe farbe;
    private final Wert wert;

    public Karte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    @Override
    public String toString(){
        return farbe + " " + wert;
    }

    public Wert getWert() {
        return wert;
    }

    public Farbe getFarbe() {
        return farbe;
    }
}
