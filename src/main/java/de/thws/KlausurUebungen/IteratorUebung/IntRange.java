package de.thws.KlausurUebungen.IteratorUebung;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntRange implements Iterable<Integer>{

    private int anfang;
    private int ziel;

    public IntRange(int anfang, int ziel){
        this.anfang = anfang;
        this.ziel = ziel;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {

            // Der Iterator braucht seinen eigenen Zustand (Cursor)
            private int cursor = anfang;

            @Override
            public boolean hasNext() {
                // Wir machen weiter, solange wir das Ende noch nicht überschritten haben
                return cursor <= ziel;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                // Gib den aktuellen Wert zurück und erhöhe DANN den Cursor um 1
                return cursor++;
            }
        };
    }

}
