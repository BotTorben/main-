package Lektion18Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import de.thws.Lektion18.Uebung3.ToUpperCaseWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest
{
    public ByteArrayOutputStream baos;
  @BeforeEach
  public void prepareTest(){
      baos = new ByteArrayOutputStream();
  }

  private String checkChar(char c){
      baos.reset();
      try(OutputStreamWriter osw = new OutputStreamWriter(baos);
      Writer writer = new ToUpperCaseWriter(osw))
      {
          writer.write(c);
          writer.flush();
          String uppercase = baos.toString();
          writer.close();
          return uppercase;
      } catch (Exception e) {
          e.printStackTrace();
          return null;
      }
  }

  @Test
  public void writeCharTest(){
      assertEquals("A",checkChar('a'));
  }

  @Test
  public void writeCharTestWithNonChar() {
      assertEquals("1", checkChar('1'));

  }

    @Test
    public void testAsciiLettersToUpperCase() {
        for (int i = 0; i < 128; i++) {
            char c = (char) i;
            if (c >= 'a' && c <= 'z') {
                String result = checkChar(c);
                String expected = String.valueOf(c).toUpperCase();
                assertEquals(expected, result, "Fehler bei Kleinbuchstabe: " + c);
            }
        }
    }

    @Test
    public void testAsciiNonLettersUnchanged() {
        for (int i = 0; i < 128; i++) {
            char c = (char) i;
            if (!(c >= 'a' && c <= 'z')) {
                String result = checkChar(c);
                String expected = String.valueOf(c);
                assertEquals(expected, result, "Fehler bei Nicht-Kleinbuchstabe: " + c);
            }
        }
    }

}
