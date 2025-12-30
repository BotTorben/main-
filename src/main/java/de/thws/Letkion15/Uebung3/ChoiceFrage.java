package de.thws.Letkion15.Uebung3;

public class ChoiceFrage extends Fragen {
    public ChoiceFrage(String frage, String[] antwortmoeglichkeit) {
        super(frage, antwortmoeglichkeit);
    }

    @Override
    public void choicefrageSysOut() {
        String moeglichkeit = "";
        char anzahl = 'a';
        for(String s: antwortmoeglichkeiten){
            moeglichkeit += anzahl + ": " + s + "\n";
            anzahl++;

        }
        System.out.println(frage + "\n\n" + moeglichkeit);
    }

    @Override
    public void textfrageSysOut() {}
}
