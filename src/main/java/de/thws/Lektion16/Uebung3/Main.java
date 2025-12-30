package de.thws.Lektion16.Uebung3;

public class Main {

    public static void main(String[] args){
        StackVererbung sv = new StackVererbung();
        Object o = new Object();
        sv.push(o);
        System.out.println(sv.isEmpty());
        sv.remove(o);
        System.out.println(sv.isEmpty());

        AggregationStack agStack = new AggregationStack();
        agStack.push(o);
        System.out.println(agStack.list.isEmpty());
        agStack.pop();
        System.out.println(agStack.list.isEmpty());

        StackIntf stack = new StackIntf();
        stack.push(o);
        System.out.println(stack.list.isEmpty());
        stack.pop();
        System.out.println(stack.list.isEmpty());
    }
}
