package de.thws.Lektion16.Uebung3;

import java.util.ArrayList;

public class StackIntf implements StackInterface{

    ArrayList list = new ArrayList();
    @Override
    public void push(Object o) {
        list.add(o);
    }
    @Override
    public Object pop() {
        return list.remove(list.size()-1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


}
