package de.thws.Letkion15.Uebung3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fragen textF = new TextFrage("Wie heisst die Hauptstadt von Deustschland");
        String[] antwortenTextC = {"12", "2", "16"};
        Fragen textC = new ChoiceFrage("Wie viele Bundeslaender gibt es?", antwortenTextC);

        Fragen[] fragen = {textF, textC};

        Quiz q1 = new Quiz(fragen);
        q1.fragenSysOut();
    }
}
