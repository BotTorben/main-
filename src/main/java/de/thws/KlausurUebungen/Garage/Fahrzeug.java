package de.thws.KlausurUebungen.Garage;

public abstract class Fahrzeug {

    double tankstand;

    public Fahrzeug(double tankstand){
        this.tankstand = tankstand;
    }

    public abstract void fahre();

    public abstract double tankstand();

    public static void fahrzeugTesten(Fahrzeug[] fs){
        for(Fahrzeug f: fs){
            System.out.println("Kilometerstand: " + f.tankstand());
            f.fahre();
        }
    }

    public static void main(String[] args) {
        Fahrzeug[] fahrArray = {new Auto(), new Fahrrad(), new Elektroauto()};
        fahrzeugTesten(fahrArray);
    }
}
