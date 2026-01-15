package de.thws.KlausurUebungen.Roulette;

import java.util.Iterator;

public class RoulettZahlen implements Iterable<Integer>
{
    @Override
    public Iterator<Integer> iterator()
    {
        return new RoulettZahlenIterator();
    }

    public static void main(String[] args) {
        Iterator<Integer> it = new RoulettZahlen().iterator();

        /*for(int i = 0; i < 1000; i++){
            System.out.println(it.next());
            System.out.println(i + "\n");
        }*/

        //Aufgabe C:
        int i = 0;
        while(it.hasNext()){
            i++;
            System.out.println(it.next());
            System.out.println(i + "\n");

            if(!it.hasNext()){
                it.next();
            }
        }
    }
}
