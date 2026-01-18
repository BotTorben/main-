package de.thws.KlausurUebungen.TowtterAufgabe;

import java.io.Serializable;

public class User implements Serializable {

    private final long serialVersionUID = 1L;

    private final String Username;
    private String Passwort;

    public User(String Username, String Passwort){
        this.Username = Username;
        this.Passwort = Passwort;
    }

    public void setPasswort(String Passwort){
        this.Passwort = Passwort;
    }

}
