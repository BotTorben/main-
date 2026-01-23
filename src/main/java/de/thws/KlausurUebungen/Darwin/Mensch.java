package de.thws.KlausurUebungen.Darwin;

import java.io.Serializable;

public class Mensch extends Lebewesen implements Serializable {

    String beruf;

    public Mensch(String name, String beruf){
        super(name);
        this.beruf = beruf;
    }

    @Override
    public void beschreibe(){

    }
}
