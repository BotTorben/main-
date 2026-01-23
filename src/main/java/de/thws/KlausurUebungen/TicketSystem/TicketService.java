package de.thws.KlausurUebungen.TicketSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class TicketService {

    private Queue<Ticket> warteschlange;

    public TicketService(){
        this.warteschlange = new PriorityQueue<>();
    }

    public void neuesTicket(Ticket t){
        warteschlange.offer(t);
    }

    public Ticket getNextTicket() {
        return warteschlange.poll();
    }

    public Ticket peekNextTicket() {
        return warteschlange.peek();
    }

    public Queue<Ticket> getWarteschlange(){
        return warteschlange;
    }

    public List<String> getHighPriorityTickets(List<Ticket> alleTickets){
        return alleTickets.stream()
                .filter(t-> t.getPrioritaet() == 1)
                .map(t-> t.getBeschreibung())
                .collect(Collectors.toList());
    }


}
