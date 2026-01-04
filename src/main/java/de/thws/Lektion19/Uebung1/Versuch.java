package de.thws.Lektion19.Uebung1;

import java.io.Serializable;

public class Versuch implements Serializable {

    private char zeichen;

    public Versuch(char zeichen){
        this.zeichen = zeichen;
    }

    public char getZeichen(){
        return zeichen;
    }
}
