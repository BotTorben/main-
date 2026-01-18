package de.thws.KlausurUebungen.Garage;

public class Fahrrad extends Fahrzeug{

    public Fahrrad(){
        super(0.0);
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
