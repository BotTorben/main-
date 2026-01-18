package de.thws.KlausurUebungen.Album;

public class MusikStueck
{
    public String titel; // Name des Musikstueckes
    public String interpret; // Gruppe/Saenger des Stueckes
    public int laenge; // Dauer in Sekunden

    public MusikStueck(String titel, String interpret, int laenge)
    {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    @Override
    public String toString(){
        return "Titel: " + titel + "\nKuenstler: " + interpret + "\nDauer: " + laenge;

    }
}

