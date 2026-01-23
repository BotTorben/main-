package de.thws.KlausurUebungen.TicketSystem;

public class SupportMitarbeiter implements Runnable{

    private String name;
    private TicketService ts;

    public SupportMitarbeiter(String name, TicketService ts){
        this.name = name;
        this.ts = ts;
    }

    @Override
    public void run(){
        Ticket t;
        while ((t = ts.getNextTicket()) != null) {
            try {
                // Simulierte Arbeit
                Thread.sleep(100);
                System.out.println("Mitarbeiter " + name + " hat Ticket " + t.getID() +
                        " (Prio " + t.getPrioritaet() + ") bearbeitet.");
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
