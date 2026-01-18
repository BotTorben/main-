package de.thws.KlausurUebungen.Garage;

public class Auto extends Fahrzeug{

    public Auto(){
        super(60.0);
    }

    @Override
    public void fahre(){
        System.out.println("Fahrzeug fährt!");
    }

    @Override
    public double tankstand(){
        return tankstand;
    }
}
