package de.thws.Letkion15.Uebung3;

import java.util.List;

public class Quiz {

    public Fragen[] fragen;

    public Quiz(Fragen[] fragen){
        this.fragen =fragen;
    }

    public void fragenSysOut(){
        for(Fragen f : fragen){
            f.textfrageSysOut();
            f.choicefrageSysOut();
        }
    }
}
