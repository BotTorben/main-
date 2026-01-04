package de.thws.Lektion19.Uebung1;

import java.io.Serializable;

public class Antwort implements Serializable {

    private String aktuellesWort;
    private boolean spielBeendet;
    private boolean gewonnen;
    private boolean treffer;
    private String nachricht;

    public Antwort(String aktuellesWort, boolean spielBeendet, boolean gewonnen, boolean treffer, String nachricht){
        this.aktuellesWort = aktuellesWort;
        this.spielBeendet = spielBeendet;
        this.gewonnen = gewonnen;
        this.treffer = treffer;
        this.nachricht = nachricht;
    }

    public String getAktuellesWort(){
        return aktuellesWort;
    }
    public boolean isSpielBeendet() {
        return spielBeendet;
    }
    public boolean gewonnen(){
        return gewonnen;
    }
    public boolean treffer(){
        return treffer;
    }
    public String nachricht(){
        return nachricht;
    }
}
