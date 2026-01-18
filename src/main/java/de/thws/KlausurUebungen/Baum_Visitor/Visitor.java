package de.thws.KlausurUebungen.Baum_Visitor;

import de.thws.KlausurUebungen.Baum_Visitor.Baum.Knoten;
public interface Visitor<T>
{
    public void visit(Knoten<T> current);
}
