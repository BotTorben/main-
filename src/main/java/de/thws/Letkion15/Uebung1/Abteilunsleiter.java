package de.thws.Letkion15.Uebung1;

public class Abteilunsleiter extends Angestellte {

    public Abteilunsleiter(String vorname, String nachname, int id, double grundgehalt) {
        super(vorname, nachname, id, grundgehalt);
        this.gehaltsfaktor = 2.0;
        this.grundgehalt = grundgehalt * gehaltsfaktor;
    }

    public void befoerdern(Angestellte zuBefoerdernder) {
        zuBefoerdernder.gehaltsfaktor += 0.1;
    }
}
