package de.thws.KlausurUebungen.Zoo;

public class Loewe extends ZooTier{

    public Loewe(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Rawwwr");
    }
}
