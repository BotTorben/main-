package de.thws.Letkion15.Uebung2;

public class Student extends Person {

    public Student(String fach) {
        super(fach);
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Student Besucht: " + fach);
    }
}
