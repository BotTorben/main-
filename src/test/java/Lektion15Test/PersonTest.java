package Lektion15Test;

import de.thws.Letkion15.Uebung2.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void gibTaetigkeitAusTestTest() {
        Person test = new Student("Programmieren");
        Person test2 = new Professor("Programmieren");

        Assertions.assertEquals("Programmieren", test.fach);
        Assertions.assertEquals("Programmieren", test2.fach);

    }
}
