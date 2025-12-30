package Lektion15Test;

import de.thws.Letkion15.Uebung1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnternehmenTest {
    @Test
    public void befoerdernTest() {
        Abteilunsleiter abteilungsleiter = new Abteilunsleiter("Max", "Mustermann", 001, 1000);
        Angestellte angestellter = new Angestellte("Maxine", "Nicht Mustermann", 001, 1000);
        abteilungsleiter.befoerdern(angestellter);

        Assertions.assertEquals(1.1, angestellter.gehaltsfaktor);
    }
}
