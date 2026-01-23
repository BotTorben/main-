package de.thws.KlausurUebungen.Darwin;

import java.io.Serializable;

public class Tier extends Lebewesen implements Serializable {

    String art;

    public Tier(String name, String art){
        super(name);
        this.art = art;
    }

    @Override
    public void beschreibe(){

    }
}
