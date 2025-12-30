package de.thws.Letkion15.Uebung2;

public abstract class Person {

    public String fach;

    public Person(String fach) {
        this.fach = fach;
    }

    public abstract void gibTaetigkeitAus();
}
