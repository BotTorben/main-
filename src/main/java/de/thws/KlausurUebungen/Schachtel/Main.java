package de.thws.KlausurUebungen.Schachtel;

import java.util.List;

public class Main {

    public static void main() {
        Box<String> bString = new Box<>();
        bString.add("Test1");
        bString.add("Test2");
        bString.add("Test3");

        System.out.println("Groesster Strin:" + bString.max());

        Box<Integer> bInteger = new Box<>();
        bInteger.add(1);
        bInteger.add(2);
        bInteger.add(3);

        System.out.println("Groesster Integer:" + bInteger.max());
    }
}
