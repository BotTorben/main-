package de.thws.Lektion20.Uebung3;

import java.util.*;

public class VokabelTrainer {

    private Map<String, Set<String>> englishToGerman = new HashMap<>();

    public VokabelTrainer(Map<String, Set<String>> englishToGerman) {
        this.englishToGerman = englishToGerman;
    }

    public void push(String english, Set<String> german){
        englishToGerman.put(english, german);
    }

    public Set<String> get(String english){
        return englishToGerman.get(english);
    }

    @Override
    public String toString(){
        return "Your translation: " + englishToGerman;
    }
}
