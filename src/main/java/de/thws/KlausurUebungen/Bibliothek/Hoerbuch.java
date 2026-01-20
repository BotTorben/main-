package de.thws.KlausurUebungen.Bibliothek;

public class Hoerbuch extends Buch{

    private String sprecher;
    private int dauerInMinuten;

    public Hoerbuch(String name, String autor, String verlag, int preisInCent, String sprecher, int dauerInMinuten){
        super(name,autor, verlag, preisInCent);
        this.sprecher = sprecher;
        this.dauerInMinuten = dauerInMinuten;
    }
}
