package de.thws.KlausurUebungen.ThreadUebung;

public class Zaehler implements Runnable{

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + "t2");
        }
    }
}
