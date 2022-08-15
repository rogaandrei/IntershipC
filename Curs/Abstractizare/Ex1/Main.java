package Abstractizare.Ex1;

public class Main {
    public static void main ( String[] args ) {
        Guitar guitar=new Guitar();
        Piano piano=new Piano();
        Saxophone saxophone=new Saxophone();
        guitar.playMusic();
        piano.playMusic();
        saxophone.playMusic();


        SalesPerson salesPerson=new SalesPerson();
        MusicalInstrument instrument1=salesPerson.sellInstrument("piano");
        MusicalInstrument instrument2=salesPerson.sellInstrument("guitar");
        MusicalInstrument instrument3=salesPerson.sellInstrument("acordion");
    }
}
