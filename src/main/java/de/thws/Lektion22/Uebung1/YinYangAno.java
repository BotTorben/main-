package de.thws.Lektion22.Uebung1;

public class YinYangAno {

    public static void main(String[] args) {
        String ano = "Yang"; // Ich nenne es mal Yang für das Beispiel

        // Anonyme Klasse: Wir definieren und erstellen das Objekt gleichzeitig
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) { // Endlosschleife für dauerhafte Ausgabe
                    try {
                        System.out.println(ano);
                        // KORREKTUR 1: Statischer Aufruf von sleep
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        // Bei Interrupt Schleife verlassen
                        return;
                    }
                }
            }
        };

        t1.start();

        // KORREKTUR 2: Kein t1.join()! Wir wollen parallel arbeiten.

        // Der Main-Thread macht "Yin"
        while (true) {
            try {
                System.out.println("Yin");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
