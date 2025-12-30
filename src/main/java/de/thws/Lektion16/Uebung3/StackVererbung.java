package de.thws.Lektion16.Uebung3;

import de.thws.Lektion16.Uebung1.Dame;

import java.util.ArrayList;

public class StackVererbung extends ArrayList {

    public boolean push(Object obj ) {
        add(obj);
        return true;
    }

    public Object pop() {
        Object o = size()-1;
        remove(size()-1);
        return o;
    }
}
