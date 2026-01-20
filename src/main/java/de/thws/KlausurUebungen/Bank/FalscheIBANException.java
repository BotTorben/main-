package de.thws.KlausurUebungen.Bank;

public class FalscheIBANException extends Exception {

    public FalscheIBANException(){}

    public FalscheIBANException(String message){
        super(message);
    }
}
