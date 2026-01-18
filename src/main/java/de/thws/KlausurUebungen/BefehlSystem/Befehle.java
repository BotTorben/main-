package de.thws.KlausurUebungen.BefehlSystem;

// Definition des Enums
public enum Befehle {

    // 1. Die Konstanten implementieren jeweils die abstrakte Methode
    START {
        @Override
        public void ausführen() {
            System.out.println("System fährt hoch... [START]");
        }
    },
    STOP {
        @Override
        public void ausführen() {
            System.out.println("System wird beendet... [STOP]");
        }
    },
    PAUSE {
        @Override
        public void ausführen() {
            System.out.println("Verarbeitung pausiert. [PAUSE]");
        }
    },
    RESET {
        @Override
        public void ausführen() {
            System.out.println("System wird auf Werkseinstellungen zurückgesetzt. [RESET]");
        }
    };

    // Die abstrakte Methode erzwingt, dass jede Konstante (START, STOP, etc.)
    // eine eigene Implementierung bereitstellen MUSS.
    public abstract void ausführen();
}

// Klasse zum Testen (Aufgabe Teil 2)
class EnumTest {

    public static void main(String[] args) {

        // 2. Ein Array von Befehlen anlegen
        Befehle[] befehlsListe = {
                Befehle.START,
                Befehle.PAUSE,
                Befehle.RESET,
                Befehle.STOP
        };

        System.out.println("--- Befehlssequenz wird abgearbeitet ---");

        // Das Array durchlaufen und ausführen() aufrufen
        for (Befehle b : befehlsListe) {
            // Polymorphie: Es wird automatisch der Code der jeweiligen Konstante ausgeführt
            b.ausführen();
        }
    }
}