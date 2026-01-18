package de.thws.KlausurUebungen.TowtterAufgabe;

import java.util.List;
import java.util.Optional;

public interface ObjectManager<T>
{
    public void serialize(List<T> object);
    public List<T> deserialize();
}
