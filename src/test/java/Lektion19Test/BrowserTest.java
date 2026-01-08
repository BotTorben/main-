package Lektion19Test;

import de.thws.Lektion19.Uebung3.Browser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

public class BrowserTest {

    @Test
    public void testBack(){
        Browser Browser = new Browser();
        for (int i = 0; i < 20; i++){
            Optional<URL> back = Browser.back();
            Assertions.assertNotNull(back);

            if(back.isPresent()){
                Assertions.assertEquals("https://www.google.com", back.get().toString());
            } else {
                Assertions.assertTrue(back.isEmpty());
            }
        }
    }
}
