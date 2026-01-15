package de.thws.KlausurUebungen.Roulette;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RoulettZahlenIterator implements Iterator<Integer> {

    private int zeroCounter = 0;
    private final Random random = new Random();

    @Override
    public boolean hasNext() {
        return zeroCounter < 3;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Das Spiel ist vorbei (3x Null gefallen).");
        }

        int zahl = random.nextInt(37);

        // Prüfen, ob es eine Null ist
        if (zahl == 0) {
            zeroCounter++;
        }

        return zahl;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
