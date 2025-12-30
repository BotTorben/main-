package Lektion15Test;

import de.thws.Lektion16.Uebung3.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    Object o = new Object();

    @Test
    public void testStackvererbung() {

        StackVererbung sv = new StackVererbung();
        sv.push(o);
        Assertions.assertEquals(false, sv.isEmpty());
        sv.pop();
        Assertions.assertEquals(true, sv.isEmpty());
    }
}
