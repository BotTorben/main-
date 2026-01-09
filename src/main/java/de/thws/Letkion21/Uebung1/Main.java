package de.thws.Letkion21.Uebung1;

public class Main {

    public static void main(String[] args){

        Naehrstoffangabe n1 = new Naehrstoffangabe.NaehrstoffangabeBuilder("500g", 2).withKohlenhydrate(2).build();
        System.out.println(n1.toString());

        Naehrstoffangabe n2 = new Naehrstoffangabe.NaehrstoffangabeBuilder("500g", 2)
                .withEiweiss(30).withFett(12).withKohlenhydrate(500).withNatrium(2).build();
        System.out.println(n2.toString());

    }
}
