package de.thws.KlausurUebungen.Bibliothek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Bibliothek {

    private List<Buch> sammlung;

    public Bibliothek(){
        this.sammlung = new ArrayList<>();
    }

    public void addBuch(Buch b){
        sammlung.add(b);
        Collections.sort(sammlung);
    }

    public List<Buch> sucheBuecherVonAutor(String autor){
        return sammlung.stream()
                .filter(b->b.autor.equals(autor))
                .collect(Collectors.toList());
    }
}
