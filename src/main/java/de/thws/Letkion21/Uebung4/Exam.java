package de.thws.Letkion21.Uebung4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exam{

    List<Question> questions = new ArrayList<Question>();

    public Exam(){
    }

    public void toTest() throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.tex"))){
            String header = readHeaderFromFile();
            bw.write(header);
            bw.newLine();
            bw.flush();

            for(Question q: questions){
                String laTex = "\\textbf{" + q.text + "}\\";

                bw.write(laTex);
                bw.newLine();
            }

            bw.write("\\end{document}");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void readQuestion(String dateiname) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname))){
            String line;
            while((line = br.readLine()) != null){
                this.questions.add(Question.toQuestion(line));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    String readHeaderFromFile() {
        return "";
    }

}
