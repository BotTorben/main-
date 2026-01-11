package de.thws.Lektion22.Uebung1;

public class YangThread extends Thread {

    private String ausgabe;

    public YangThread(String ausgabe){
        this.ausgabe = ausgabe;
    }
    @Override
    public void run() {
        // Hier passiert die Arbeit des parallelen Threads
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

    public static class YinYang {

        public static void main(String[] args) {
            // 2. Objekt der Thread-Klasse erstellen
            YangThread yang = new YangThread("Lümmel");
            yang.start();

            try{
                yang.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

