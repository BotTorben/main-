package de.thws.KlausurUebungen.Synonyme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap<K, V> {

    private Map<K, List<V>> internMap;

    public MultiMap() {
        this.internMap = new HashMap<>();
    }

    public void put(K key, V value) {
        if (!internMap.containsKey(key)) {
            internMap.put(key, new ArrayList<>());
        }

        List<V> werteListe = internMap.get(key);
        werteListe.add(value);
    }

    public List<V> get(K key){
        return internMap.get(key);
    }
}
