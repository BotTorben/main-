package de.thws.KlausurUebungen.TowtterAufgabe;

import java.util.*;


public class TwotterSystem {

    private Map<User, List<Message>> user;

    public TwotterSystem(){
        this.user = new HashMap<>();
    }

    public void addMessage(User u, Message m) {
        if (m.getText().length() > 140) {
            System.err.println("Fehler: Nachricht zu lang (max 140 Zeichen)!");
            return;
        }

        if (!user.containsKey(u)) {
            user.put(u, new ArrayList<>());
        }

        user.get(u).add(m);
    }

    public List<Message> getAllMessages(){
        List<Message> allMessagesList = new ArrayList<>();

        for (List<Message> userMessages : user.values()) {
            allMessagesList.addAll(userMessages);
        }

        return allMessagesList;
    }

    public List<Message> getAllMessagesFromDate(String date){
        List<Message> allMessages = getAllMessages();
        List<Message> ergebnis = new ArrayList<>();
        allMessages.stream()
                .filter(m-> m.getCreationDate().equals(date))
                .toList();
        return ergebnis;
    }

    public List<Message> getAllMessagesFromUser(User u){
        if(user.containsKey(u)){
            return user.get(u);
        } else {
            return null;
        }
    }
}
