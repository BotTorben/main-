package de.thws.Lektion16.Uebung3;

import java.util.ArrayList;

public class AggregationStack {
    ArrayList<Object> list = new ArrayList<Object>();

    public boolean push(Object o){
        list.add(o);
        return true;
    }

    public Object pop(){
        Object o = list.size()-1;
        list.remove(list.size()-1);
        return o;
    }
}
