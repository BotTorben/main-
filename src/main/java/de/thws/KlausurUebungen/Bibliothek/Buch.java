package de.thws.KlausurUebungen.Bibliothek;

public abstract class Buch implements Comparable<Buch>{
    String name;
    String autor;
    String verlag;
    int preisInCents;

    public Buch(String name, String autor, String verlag, int preisInCents)
    {
        this.name = name;
        this.autor = autor;
        this.verlag = verlag;
        this.preisInCents = preisInCents;
    }

    @Override
    public int compareTo(Buch b){
        if(this.autor.compareTo(b.autor) == 0){
            return this.name.compareTo(b.name);
        }
        return this.autor.compareTo(b.autor);
    }
}
