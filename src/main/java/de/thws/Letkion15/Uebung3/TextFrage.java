package de.thws.Letkion15.Uebung3;

public class TextFrage extends Fragen {

    public TextFrage(String frage) {
        super(frage);
    }

    @Override
    public void textfrageSysOut() {
        System.out.println(frage + "\n\n" + antwortText + ":\n" + "_______________");
    }

    @Override
    public void choicefrageSysOut() {}
}
