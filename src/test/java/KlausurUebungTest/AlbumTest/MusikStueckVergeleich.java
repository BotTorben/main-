package KlausurUebungTest.AlbumTest;

import de.thws.KlausurUebungen.Album.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MusikStueckVergeleich {

    private static MusikStueckSammlung sammlung;
    private static MusikStueck stueckKurz;
    private static MusikStueck stueckMittel;
    private static MusikStueck stueckLang;

    // Diese Methode läuft VOR jedem einzelnen Test.
    // So starten wir immer mit einer frischen, definierten Umgebung.
    @BeforeAll
    public static void setUp() {
        sammlung = new MusikStueckSammlung();

        // Wir erstellen 3 Test-Objekte:
        // A: Titel "Zebra" (ganz hinten), aber kurz (100)
        // B: Titel "Abba" (ganz vorne), aber lang (300)
        // C: Titel "Mitte" (Mitte), mittel (200)
        stueckKurz = new MusikStueck("Zebra Song", "Artist Z", 100);
        stueckLang = new MusikStueck("Abba Song", "Artist A", 300);
        stueckMittel = new MusikStueck("Best Of", "Artist B", 200);

        // Wir fügen sie "durcheinander" ein
        sammlung.musikStueckEinfügen(stueckKurz);
        sammlung.musikStueckEinfügen(stueckLang);
        sammlung.musikStueckEinfügen(stueckMittel);
    }

    @Test
    void testSortierungNachTitel() {
        // Act: Liste holen
        List<MusikStueck> result = sammlung.getAlleMusikStueckeNachTitel();

        // Assert: Prüfen, ob die Reihenfolge alphabetisch ist (A -> B -> Z)
        Assertions.assertEquals("Abba Song", result.get(0).titel, "Erstes Element sollte Abba sein");
        Assertions.assertEquals("Best Of", result.get(1).titel, "Zweites Element sollte Best Of sein");
        Assertions.assertEquals("Zebra Song", result.get(2).titel, "Drittes Element sollte Zebra sein");

        // Prüfung der Größe, um sicherzugehen, dass nichts verloren ging
        Assertions.assertEquals(3, result.size());
    }

    @Test
    void testSortierungNachLaenge() {
        // Act: Liste holen
        List<MusikStueck> result = sammlung.getAlleMusikStueckeNachLaenge();

        // Assert: Prüfen, ob die Reihenfolge nach Länge aufsteigend ist (100 -> 200 -> 300)
        // Achtung: Hier vergleichen wir Objekte oder int-Werte
        Assertions.assertEquals(100, result.get(0).laenge, "Erstes Element muss 100 lang sein");
        Assertions.assertEquals(stueckMittel, result.get(1), "Zweites Element muss das mittlere Objekt sein");
        Assertions.assertEquals(300, result.get(2).laenge, "Drittes Element muss 300 lang sein");
    }

    // Optional: Test für die Exception (Kür)
    @Test
    void testDoppelterEintragWirftException() {
        MusikStueck doppelt = new MusikStueck("Abba Song", "Copycat", 500);

        // AssertThrows prüft, ob der Code im Lambda WIRKLICH abstürzt
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sammlung.musikStueckEinfügen(doppelt);
        });
    }
}
