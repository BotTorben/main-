package KlausurUebungTest.AutoTest;

import static org.junit.jupiter.api.Assertions.*;

import de.thws.KlausurUebungen.AltKlausurGarage.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoHaendler_Test {

    @Test
    public void testMapping(){
        List<Auto> autoListe = List.of (
                new Auto("Citroen C3", Kraftstoffart.ELEKTRO),
                new Auto("Citroen C5", Kraftstoffart.BENZIN),
                new Auto("Citroen C5", Kraftstoffart.ELEKTRO));

        AutoHaedler ah = new AutoHaedler();
        autoListe.stream().forEach(a-> ah.addAuto(a));

        Map<Kraftstoffart, List<Auto>> autoMap = new HashMap<>();
        autoMap.put(Kraftstoffart.ELEKTRO , ah.filterNachKraftstoff(Kraftstoffart.ELEKTRO));

        Assertions.assertNotEquals(autoMap, ah.mapAutoNachKraftstoff());

    }
}
