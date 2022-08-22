package Exercitii_din_fisierul_text.Curs5.Ex4;

public class Main {
    public static void main ( String[] args ) {
        Boeing boeing = new Boeing("a123", 1000, 200);
        Miguri miguri = new Miguri("b299", 5000);
        Tomcaturi tomcaturi = new Tomcaturi("b456", 6000);
        Concorde concorde = new Concorde("b325", 2000, 250);
        tomcaturi.launchMissile();
        tomcaturi.refuel();
    }
}
