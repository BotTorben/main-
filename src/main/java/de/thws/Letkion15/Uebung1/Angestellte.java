package de.thws.Letkion15.Uebung1;

public class Angestellte {

    public String vorname;
    public String nachname;
    public int id;
    public double grundgehalt;
    public double gehaltsfaktor;

    public  Angestellte(String vorname, String nachname, int id, double gehaltsfaktor){
        this.vorname = vorname;
        this.nachname = nachname;
        this.id = id;
        this.grundgehalt = grundgehalt * gehaltsfaktor;
        this.gehaltsfaktor = 1.0;
    }
}
