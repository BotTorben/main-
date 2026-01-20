package KlausurUebungTest.IBANTest;
import de.thws.KlausurUebungen.Bank.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IbanServiceTest {

    @Test
    public void checkIbanTest(){
        String zuLangeIBAN = "DE123456789012345678900";
        Assertions.assertThrows(FalscheIBANException.class, () -> {
            IbanService.checkIBAN(zuLangeIBAN);
        });

        String falscherLaenderCodeIBAN = "de12345678901234567890";
        Assertions.assertThrows(FalscheIBANException.class, ()->{
           IbanService.checkIBAN(falscherLaenderCodeIBAN);
        });
    }

    @Test
    public void liesIbanAusDateiTest(){
        Assertions.assertEquals
                ("DE12345", IbanService.liesIbanAusDatei("ibans.txt").get(0));
        Assertions.assertEquals(1, IbanService.liesIbanAusDatei("ibans.txt").size());
    }
}
