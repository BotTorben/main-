package de.thws.KlausurUebungen.FahrtKlausuraufgabe;

import java.util.List;

public class Unternehmen {

    private List<Fahrzeug> fahrzeuge;

    public Unternehmen(List<Fahrzeug> fahrzeuge){
        this.fahrzeuge = fahrzeuge;
    }

    public double berechneUmsatz(){
        double Umsatz = 0.0;
        for (Fahrzeug f : fahrzeuge){
            for(int i = 0; i <= f.getFahrten().size()-1; i++){
                Umsatz += f.berechenFahrtKosten(i);
            }
        }
        return Umsatz;
    }
}
