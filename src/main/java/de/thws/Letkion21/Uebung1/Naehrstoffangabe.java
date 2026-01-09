package de.thws.Letkion21.Uebung1;

public class Naehrstoffangabe {

    private String portionsgroesse;
    private int AnzahlPortionen;
    private int Eiweiss;
    private int Fett;
    private int Kohlenhydrate;
    private int Natrium;

    private Naehrstoffangabe(String portionsgroesse, int AnzahlPortionen){
        this.portionsgroesse = portionsgroesse;
        this.AnzahlPortionen = AnzahlPortionen;
    }

    private Naehrstoffangabe(String portionsgroesse, int AnzahlPortionen, int Eiweiss, int Fett, int Kohlenhydrate, int Natrium) {
        this.portionsgroesse = portionsgroesse;
        this.AnzahlPortionen = AnzahlPortionen;
        this.Eiweiss = Eiweiss;
        this.Fett = Fett;
        this.Kohlenhydrate = Kohlenhydrate;
        this.Natrium = Natrium;
    }

    @Override
    public String toString() {
        return new String("Portionsgroesse: " + portionsgroesse + " Anzahl Portionen: " + AnzahlPortionen
        + " Eiweiss: " + Eiweiss + " Fett: " + Fett + " Kohlenhydrate: "+ Kohlenhydrate + " Natrium: " + Natrium);
    }

    public static class NaehrstoffangabeBuilder {

        private String portionsgroesse;
        private int AnzahlPortionen;
        private int Eiweiss;
        private int Fett;
        private int Kohlenhydrate;
        private int Natrium;

        public NaehrstoffangabeBuilder(String portionsgroesse, int AnzahlPortionen){
            this.portionsgroesse = portionsgroesse;
            this.AnzahlPortionen = AnzahlPortionen;
        }

        public NaehrstoffangabeBuilder(String portionsgroesse, int AnzahlPortionen, int Eiweiss, int Fett, int Kohlenhydrate, int Natrium) {
            this.portionsgroesse = portionsgroesse;
            this.AnzahlPortionen = AnzahlPortionen;
            this.Eiweiss = Eiweiss;
            this.Fett = Fett;
            this.Kohlenhydrate = Kohlenhydrate;
            this.Natrium = Natrium;
        }

        public NaehrstoffangabeBuilder withEiweiss(int Eiweiss){
            this.Eiweiss = Eiweiss;
            return this;
        }

        public NaehrstoffangabeBuilder withFett(int Fett){
            this.Fett = Fett;
            return this;
        }

        public NaehrstoffangabeBuilder withKohlenhydrate(int Kohlenhydrate){
            this.Kohlenhydrate = Kohlenhydrate;
            return this;
        }

        public NaehrstoffangabeBuilder withNatrium(int Natrium){
            this.Natrium = Natrium;
            return this;
        }

        public Naehrstoffangabe build(){
            return new Naehrstoffangabe(portionsgroesse, AnzahlPortionen, Eiweiss, Fett, Kohlenhydrate, Natrium);
        }
    }// Builder Ende
}
