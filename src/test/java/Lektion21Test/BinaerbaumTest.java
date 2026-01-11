package Lektion21Test;

import de.thws.Letkion21.Uebung3.Binaerbaum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BinaerbaumTest {

    @Test
    public void testBinaerbaum() {
        Binaerbaum<Integer> baum = new Binaerbaum<>();

        // 2. Act: Elemente unsortiert hinzufügen
        // Struktur sollte sein:
        //       5
        //      / \
        //     3   7
        //    /     \
        //   1       9
        baum.add(5);
        baum.add(3);
        baum.add(7);
        baum.add(1);
        baum.add(9);

        // Doppelte hinzufügen (sollte ignoriert werden, je nach Implementierung)
        baum.add(5);

        // 3. Assert: Prüfen, ob die Ausgabe sortiert ist (In-Order Eigenschaft)
        List<Integer> ergebnis = baum.getSortedList();

        // Erwartete Liste
        List<Integer> erwartet = List.of(1, 3, 5, 7, 9);

        assertEquals(erwartet, ergebnis, "Der Baum sollte die Zahlen sortiert zurückgeben");
    }

    @Test
    void testStringBaum() {
        // Test mit Strings statt Integers (Generics Test)
        Binaerbaum<String> wortBaum = new Binaerbaum<>();

        wortBaum.add("Zebra");
        wortBaum.add("Affe");
        wortBaum.add("Maus");

        List<String> ergebnis = wortBaum.getSortedList();

        assertEquals("Affe", ergebnis.get(0));
        assertEquals("Maus", ergebnis.get(1));
        assertEquals("Zebra", ergebnis.get(2));
    }
}
