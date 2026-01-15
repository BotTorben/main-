package de.thws.Lektion22.Uebung2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlThread extends Thread {

    private List<Integer> zahlenZumTesten;

    private Map<Integer, Boolean> ergebnisMap;

    public PrimzahlThread(List<Integer> zahlenZumTesten) {
        this.zahlenZumTesten = zahlenZumTesten;
        this.ergebnisMap = new HashMap<>();
    }

    private boolean istPrimzahl(int zahl) {
        if (zahl < 2) return false;
        for (int divisor = 2; divisor <= Math.sqrt(zahl); divisor++) {
            if (zahl % divisor == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        for (Integer zahl : zahlenZumTesten) {
            boolean check = istPrimzahl(zahl);

            ergebnisMap.put(zahl, check);
        }
    }

    public Map<Integer, Boolean> getPrimzahlMap() {
        return ergebnisMap;
    }
}