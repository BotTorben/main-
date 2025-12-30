package de.thws.Letkion15.Uebung2;

public class Professor extends Person {

    public Professor(String fach) {
        super(fach);
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Unterrichtet Fach: " + fach);
    }
}
