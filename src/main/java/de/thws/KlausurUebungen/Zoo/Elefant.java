package de.thws.KlausurUebungen.Zoo;

public class Elefant extends ZooTier{

    public Elefant(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Trompeten Ton");
    }
}
