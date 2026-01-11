package de.thws.Lektion22.Uebung1;

public class YingYangThreadInf implements Runnable {

    private String ausgabe;

    public YingYangThreadInf(String ausgabe) {
        this.ausgabe = ausgabe;
    }


    @Override
    public void run() {

        while (true) {
            try {
                System.out.println(ausgabe);
                Thread.sleep(500);
                System.out.println("Yin");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Wenn der Thread beim Schlafen unterbrochen wird
                e.printStackTrace();
                break; // Schleife beenden bei Fehler
            }
        }
    }

    public static class Main{
        public static void main(String[] args) {
            YingYangThreadInf yinf = new YingYangThreadInf("YingYangThreadInf");
            Thread t1 = new Thread(yinf);
            t1.start();

            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
