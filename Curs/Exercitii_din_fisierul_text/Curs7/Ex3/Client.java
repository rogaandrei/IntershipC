package Exercitii_din_fisierul_text.Curs7.Ex3;

import java.util.ArrayList;

public class Client {
    private static final int maxConturi = 5;

    private String nume, adresa;

    private ContBancar[] contbancar;

    private int numarConturi = 0;

    public Client ( String nume, String adresa, ContBancar[] conturi ) {

        this.nume = nume;

        this.adresa = adresa;

        if (conturi.length < maxConturi) {

            this.contbancar = new ContBancar[conturi.length];

            this.contbancar = conturi;

            this.numarConturi = conturi.length;

        } else {

            System.out.println("Nu se pot crea mai mult de " + maxConturi + " conturi");

        }

    }

    public void adaugareContBancar ( ContBancar b1 ) {

        if (numarConturi < maxConturi) {

            ContBancar[] tmp = new ContBancar[numarConturi + 1];

            for (int i = 0; i < numarConturi; i++)

                tmp[i] = contbancar[i];

            tmp[numarConturi] = b1;

            contbancar = tmp;

            numarConturi++;

        } else {

            System.out.println("Nu se pot crea mai mult de " + maxConturi + " conturi");

        }

    }

    public void setNume ( String nume ) {

        this.nume = nume;

    }

    public void setAdresa ( String adresa ) {

        this.adresa = adresa;

    }

    public String getNume () {

        return this.nume;

    }

    public String getAdresa () {

        return adresa;

    }

    public String toString () {

        String result = "";

        String result2 = "";

        result = result + "Client:      " + this.nume + "\nAdresa:      " + this.adresa + "\n";

        for (int i = 0; i < contbancar.length; i++) {

            String result3 = "Cont bancar ";

            result2 = result2 + result3 + (i + 1) + ": " + contbancar[i].numarCont + "\n               Suma totala: " + contbancar[i].getSumaTotala() + "\n";

        }

        result = result + result2;

        return result;

    }

}