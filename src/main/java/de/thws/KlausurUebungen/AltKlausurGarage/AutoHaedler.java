package de.thws.KlausurUebungen.AltKlausurGarage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AutoHaedler {

    public List<Auto> autos;

    public AutoHaedler(){
        this.autos = new ArrayList<>();
    }

    public void addAuto(Auto a){
        autos.add(a);
    }

    public List<Auto> filterNachKraftstoff(Kraftstoffart kraftstoffart){
        return autos.stream().filter(a-> a.kraftstoffart == kraftstoffart).collect(Collectors.toList());
    }

    public Map<Kraftstoffart, List<Auto>> mapAutoNachKraftstoff(){
        Map<Kraftstoffart, List<Auto>> bestandSortiert = new HashMap<>();
        for (Auto a: autos){
            if(!bestandSortiert.containsKey(a.kraftstoffart)){
                bestandSortiert.put(a.kraftstoffart, new ArrayList<>());
            }
            bestandSortiert.get(a.kraftstoffart).add(a);
        }
        return bestandSortiert;
    }
}
