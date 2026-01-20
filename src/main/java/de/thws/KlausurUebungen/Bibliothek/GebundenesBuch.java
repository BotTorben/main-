package de.thws.KlausurUebungen.Bibliothek;

public class GebundenesBuch extends Buch{

    private int seitenzahl;

    public GebundenesBuch(String name, String autor, String verlag, int preisInCent, int seitenzahl){
        super(name, autor, verlag, preisInCent);
        this.seitenzahl = seitenzahl;
    }
}
