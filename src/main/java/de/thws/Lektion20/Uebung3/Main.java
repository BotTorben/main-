package de.thws.Lektion20.Uebung3;

import java.util.*;

public class Main {

    public static void main(String[] args){

        String toWork = "to work";
        String[] arbeiten = {"Arbeiten", "Schaffen", "Knechten", "Hasseln"};
        Set<String> toWorkTrans = new HashSet<>();
        Collections.addAll(toWorkTrans, arbeiten);

        Map<String, Set<String>> toWorkMap = new HashMap<>();
        toWorkMap.put(toWork, toWorkTrans);
        VokabelTrainer v1 = new VokabelTrainer(toWorkMap);

        System.out.println(v1.toString());
        System.out.println("Dein Wort: " + toWork + "\n" + "Uebersetzung: " + v1.get(toWork));
    }
}
