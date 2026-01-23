package de.thws.KlausurUebungen.ThreadUebung;

public class Main {

    public static void main(String[] args){

        ZaehlerThread t1 = new ZaehlerThread();
        Thread t2 = new Thread(new Zaehler());
        Thread t3 = new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    System.out.println(i + "t3");
                }
            }
        };
        Thread t4 = new Thread(()-> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + "t4");
            }});


        try{
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

            t4.start();
            t4.join();
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
