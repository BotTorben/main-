package de.thws.KlausurUebungen.Schachtel;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    List<T> liste;

    public Box(){
        this.liste = new ArrayList<>();
    }

    public void add(T t){
        liste.add(t);
    }

    public T max(){
        if(liste == null){
            return null;
        }

        T maxElement = liste.get(0);
        for (T t: liste){
            if(t.compareTo(maxElement) > 0){
                maxElement = t;
            }
        }
        return maxElement;
    }
}
