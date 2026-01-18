package de.thws.KlausurUebungen.Zoo;

public class Main {

    public static void main(String[] args) {
        ZooTier[] z1 = {
                new Loewe("Simba"),
                new Papagei("Mirabella"),
                new Elefant("Jumbo")
        };

        for(ZooTier t : z1){
            System.out.print(t.name + ": ");
            t.makeSound();
        }
    }
}
