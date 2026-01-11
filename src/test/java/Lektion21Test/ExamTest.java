package Lektion21Test;

import de.thws.Letkion21.Uebung4.Exam;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamTest {

    @Test
    public void TestExam()throws IOException{

        Exam exam = new Exam();

        exam.readQuestion("questions.csv");
        exam.toTest();

        boolean existiert = Files.exists(Paths.get("test.tex"));

        assertTrue(existiert, "Die Datei test.tex sollte existieren.");
    }
}
