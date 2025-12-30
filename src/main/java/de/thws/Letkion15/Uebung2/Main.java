package de.thws.Letkion15.Uebung2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> stuOrProf= new ArrayList<Person>();
        for(int i = 0; i < 100; i++){
            if(i%2==0){
                stuOrProf.add(new Student("Programmieren"));
            } else {
                stuOrProf.add(new Professor("Programmieren"));
            }
        }
        for(Person p : stuOrProf){
            p.gibTaetigkeitAus();
        }
    }
}
