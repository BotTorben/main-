package de.thws.Letkion21.Uebung3;

import java.util.ArrayList;
import java.util.List;

public class Binaerbaum<T extends Comparable<T>> {

    private static class Element<T>{

        T value;
        Element<T> right;
        Element<T> left;

        public Element(T value){
            this.value = value;
        }
    }//End of element


    private Element<T> root;

    public void add(T value){
        root = addRecursive(root, value);
    }

    private Element<T> addRecursive(Element<T> current, T value) {

        if (current == null) {
            return new Element<>(value);
        }

        if (value.compareTo(current.value) < 0) {
            current.left = addRecursive(current.left, value);
        }
        else if (value.compareTo(current.value) > 0) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public List<T> getSortedList() {
        List<T> result = new ArrayList<>();
        collectInOrder(root, result);
        return result;
    }

    private void collectInOrder(Element<T> root, List<T> list) {
        if (root != null) {
            collectInOrder(root.left, list);
            list.add(root.value);
            collectInOrder(root.right, list);
        }
    }

    public void printTree() {
        System.out.println("Reihenfolge des Baumes: " + getSortedList());
    }
}
