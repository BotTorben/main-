package de.thws.KlausurUebungen.TowtterAufgabe;

import java.util.List;

public class Main {

    public static void main(String[]args){
        List<User> userList = List.of(
                new User("Bot1", "1234"),
                new User("Bot2", "12345"),
                new User("Bot3", "123456"));

        UserManager um = new UserManager();
        um.serialize(userList);

        List<User> geladeneUser = um.deserialize();
    }
}
