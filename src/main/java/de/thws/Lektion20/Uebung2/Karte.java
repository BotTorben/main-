package de.thws.Lektion20.Uebung2;

import de.thws.Lektion20.Uebung1.Farbe;
import de.thws.Lektion20.Uebung1.Wert;

public class Karte implements Comparable<Karte> {

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

    @Override
    public int compareTo(Karte other) {
        boolean istBube = this.wert == Wert.BUBE;
        boolean istNichtBube = other.wert == Wert.BUBE;
        if(istBube && istNichtBube) {
            return this.farbe.compareTo(other.farbe);
        }
        if(istBube && !istNichtBube) {
            return -1;
        }
        if(!istBube && istNichtBube) {
            return 1;
        }

        if(this.farbe != other.farbe){
            return this.farbe.compareTo(other.farbe);
        }

        return this.wert.compareTo(other.wert);
    }

}
