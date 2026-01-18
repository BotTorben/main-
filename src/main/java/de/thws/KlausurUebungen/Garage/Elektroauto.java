package de.thws.KlausurUebungen.Garage;

public class Elektroauto extends Fahrzeug{

    public Elektroauto(){
        super(80.0);
    }

    @Override
    public void fahre() {
        System.out.println("Fahrzeug fährt!");
    }

    @Override
    public double tankstand() {
        return tankstand;
    }
}
