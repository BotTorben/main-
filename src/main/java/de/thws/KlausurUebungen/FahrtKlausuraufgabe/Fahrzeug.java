package de.thws.KlausurUebungen.FahrtKlausuraufgabe;

import java.util.List;

public class Fahrzeug {

    private final String Typ;
    private final String Name;
    private List<Fahrt> fahrten;

    public Fahrzeug(String Typ, String Name, List<Fahrt> fahrten){
        this.Typ = Typ;
        this.Name = Name;
        this.fahrten = fahrten;
    }

    public double berechenFahrtKosten(int welcheFahrt){
        if(this.Typ.equals("Fahrrad")){
            return 12.5 * fahrten.get(welcheFahrt).min;
        }
        if(this.Typ.equals("Motorroller")){
            return 15 * fahrten.get(welcheFahrt).km;
        }
        if(this.Typ.equals("Kleintransporter")){
            if(fahrten.get(welcheFahrt).min <= 60){
                return 30 * fahrten.get(welcheFahrt).km;
            } else {
                return 30 * fahrten.get(welcheFahrt).km + 25 * fahrten.get(welcheFahrt).min;
            }
        }
        else {
            return 0;
        }
    }

    public String getName() {
        return Name;
    }

    public String getTyp() {
        return Typ;
    }

    public List<Fahrt> getFahrten() {
        return fahrten;
    }
}
