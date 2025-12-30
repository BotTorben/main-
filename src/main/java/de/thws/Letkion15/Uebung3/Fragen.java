package de.thws.Letkion15.Uebung3;

public abstract class Fragen {

    public String[] antwortmoeglichkeiten;
    public String antwortText;
    public String frage;


    public Fragen(String frage, String[] antwortmoeglichkeiten) {
        this.frage = frage;
        this.antwortmoeglichkeiten = antwortmoeglichkeiten;
    }

    public Fragen(String frage) {
        this.frage = frage;
    }

    public abstract void textfrageSysOut();
    public abstract void choicefrageSysOut();
}
