package de.thws.KlausurUebungen.Album;

import java.util.*;

public class MusikStueckSammlung {

    public Map<String, MusikStueck> Sammlung;

    public MusikStueckSammlung(){
        this.Sammlung = new HashMap<>();
    }

    public void musikStueckEinfügen(MusikStueck neu){
        if(Sammlung.containsKey(neu.titel)){
         throw new IllegalArgumentException("Das Musikstueck existiert bereits in deiner Sammlung!");
        }
        Sammlung.put(neu.titel, neu);
    }

    public List<MusikStueck> getAlleMusikStueckeNachTitel(){
        List<MusikStueck> alleStuecke = new ArrayList<>(Sammlung.values());
        Collections.sort(alleStuecke, new VergleichMusikStueckTitel());
        return alleStuecke;
    }

    public List<MusikStueck> getAlleMusikStueckeNachLaenge(){
        List<MusikStueck> alleStuecke = new ArrayList<>(Sammlung.values());
        Collections.sort(alleStuecke, new VergleichMusikStuekLaenge());
        return alleStuecke;
    }
}
