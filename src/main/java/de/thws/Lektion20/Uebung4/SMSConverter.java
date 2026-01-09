package de.thws.Lektion20.Uebung4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SMSConverter {

    public SMSConverter() {
    }

    public static String convertDigit(String vocals) throws IllegalArgumentException {
        char[] vocalArray = vocals.toUpperCase().toCharArray();
        String numbers = "";
        for(char c : vocalArray) {
            switch (c) {
                case 'A': case 'B': case 'C': numbers += 2;
                break;
                case 'D': case 'E': case 'F': numbers += 3;
                break;
                case 'G': case 'H': case 'I': numbers += 4;
                break;
                case 'J': case 'K': case 'L': numbers += 5;
                break;
                case 'M': case 'N': case 'O': numbers += 6;
                break;
                case 'P': case 'Q': case 'R': case 'S': numbers += 7;
                break;
                case 'T': case 'U': case 'V': numbers += 8;
                break;
                case 'W': case 'X': case 'Y': case 'Z': numbers += 9;
                break;
                default:
                    throw new IllegalTelephoneNumberException("Falscher Buschstabe");
            }
        }
        return numbers;
    }

    public void convert(String Inputfilename, String Outputfilename){
        try(BufferedReader br = new BufferedReader(new FileReader(Inputfilename));
            BufferedWriter bw = new BufferedWriter(new FileWriter(Outputfilename))){

            String line;

            while((line = br.readLine()) != null){

                String numbers = convertDigit(line);
                bw.write(numbers);
                bw.newLine();
                System.out.println("Buchstaben: " + line + "\nZahlen: " + numbers);
            }

        }catch (IllegalTelephoneNumberException etne){
            etne.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
