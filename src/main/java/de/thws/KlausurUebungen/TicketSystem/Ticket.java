package de.thws.KlausurUebungen.TicketSystem;

public class Ticket implements Comparable<Ticket>{

    private int id;
    private String beschreibung;
    private int prioritaet;

    public Ticket(int id, String beschreibung, int prioritaet) throws UngueltigePrioritaetenException{
        this.id = id;
        this.beschreibung = beschreibung;
        if(prioritaet < 1 || prioritaet > 5){
            throw new UngueltigePrioritaetenException("Deine Prioriteaet bei TicketId: " + id + " ist ungültig");
        }
        this.prioritaet = prioritaet;
    }

    @Override
    public int compareTo(Ticket t){
        return Integer.compare(prioritaet, t.prioritaet);
    }

    public int getID(){
        return id;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
