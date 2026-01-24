package de.thws.KlausurUebungen.WOW;

import java.util.List;

public class ZauberHeld extends Held implements Zauberer{

    public int zauberpunkte;

    public ZauberHeld(String name, int trefferpunkte, String rasse, int zauberpunkte){
        super(name, trefferpunkte, rasse);
        this.zauberpunkte = zauberpunkte;
    }

    @Override
    public int getZauberpunkte(){
        return this.zauberpunkte;
    }

    @Override
    public void setZauberpunkte(int Punkte){
        this.zauberpunkte = Punkte;
    }


    public static void halbiereZauberPunkte(List<Zauberer> zauberers){
        zauberers.stream().forEach(c-> c.setZauberpunkte(c.getZauberpunkte()/2));
    }
}
