package de.thws.KlausurUebungen.ThreadUebung;

public class ZaehlerThread extends Thread{

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + "t1");
        }
    }
}
