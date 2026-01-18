package de.thws.KlausurUebungen.Album;

import java.util.Comparator;

public class VergleichMusikStueckTitel implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        return o1.titel.compareTo(o2.titel);
    }
}
