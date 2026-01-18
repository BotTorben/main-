package de.thws.KlausurUebungen.Album;

import java.util.Comparator;

public class VergleichMusikStuekLaenge implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        return Integer.compare(o1.laenge,o2.laenge);
    }
}
