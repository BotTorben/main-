package de.thws.Lektion19.Uebung2;

import java.util.ArrayList;

public class GenerickStack<E> {
    private ArrayList<E> elements;

    public GenerickStack() {
        // Initialisierung der Liste für Typ E
        this.elements = new ArrayList<>();
    }

    // Methode nimmt nun Typ E entgegen
    public void push(E value) {
        elements.add(value);
    }

    // Methode gibt nun Typ E zurück -> Kein Casten beim Aufrufer nötig!
    public E pop() {
        if (elements.isEmpty()) {
            // Optional: Exception werfen, wenn Stack leer ist
            throw new IllegalStateException("Stack ist leer");
        }
        // remove(index) gibt das entfernte Element zurück.
        // Wir nehmen das letzte Element (LIFO - Last In First Out)
        return elements.remove(elements.size() - 1);
    }

    // Hilfsmethode (optional, aber nützlich)
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Die main-Methode aus der Aufgabenstellung
    public static void main(String[] args) {
        // Hier legen wir fest, dass E = String ist
        GenerickStack<String> s = new GenerickStack<>();

        s.push("Hallo");
        s.push("Welt");

        // Da s.pop() jetzt garantiert einen String liefert, ist das typsicher.
        System.out.println(s.pop()); // Ausgabe: Welt
        System.out.println(s.pop()); // Ausgabe: Hallo
    }
}
