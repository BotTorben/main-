package de.thws.KlausurUebungen.Bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IbanService {

    public static boolean checkIBAN(String IBAN) throws FalscheIBANException{
        char[] ibanArray = IBAN.toCharArray();
        if(ibanArray.length != 22) {
            throw new FalscheIBANException("Die Iban: " + IBAN + "hat nicht die passende Laenge!");
        }
        if((ibanArray[0] < 'A' || ibanArray[0] > 'Z') && (ibanArray[1] < 'A' || ibanArray[1] > 'Z')){
            throw new FalscheIBANException("Die Iban: " + IBAN + "hat eine Falschen Länderschlüssel");
        }
        return true;
    }

    public static List<String> liesIbanAusDatei(String dateiname){

        List<String> falscheIBAN = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname));) {

            String iban;
            while ((iban = br.readLine()) != null) {
                try {
                    checkIBAN(iban);
                } catch (FalscheIBANException fie) {
                    falscheIBAN.add(iban);
                }
            }

        } catch (IOException ioe){
            System.err.println("Fehler beim lesen der Datei: " + ioe.getMessage());
            ioe.printStackTrace();
        }
        return falscheIBAN;
    }

    public static Map<String, List<String>> liesIbanAusDateien(List<String> dateiName) throws FalscheIBANException{
        Map<String, List<String>> falscheIbanMap = new HashMap<>();
        dateiName.stream().forEach(name->{ falscheIbanMap.put(name, liesIbanAusDatei(name));});
        return falscheIbanMap;
    }
}
