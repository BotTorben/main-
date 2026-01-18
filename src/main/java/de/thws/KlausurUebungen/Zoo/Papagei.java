package de.thws.KlausurUebungen.Zoo;

public class Papagei extends ZooTier{

    public Papagei(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Ich bin ein Papagei");
    }
}
