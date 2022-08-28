package Exercitii_din_fisierul_text.Curs7.Ex3;

import java.util.ArrayList;

public class Client {
    String nume;
    String adresa;
    ArrayList<ContBancar>conturi;

    public Client ( String nume, String adresa ) {
        this.nume = nume;
        this.adresa = adresa;

    }

    public void afisare(){
        System.out.println("Clientul " + nume + " care locuieste:" + adresa + " are " + conturi);
    }
}
