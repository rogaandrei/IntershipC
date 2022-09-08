package Exercitii_din_fisierul_text.Curs7.Ex3;

import java.util.ArrayList;

public class Main {
    public static void main ( String[] args ) {
        Banca b1 = new Banca();

        b1.setCodBanca("Banca X");

        ContBancar cl1 = new ContInLei("123", 1000);

        ContBancar cl2 = new ContInLei("124", 1500);

        ContBancar ce1 = new ContInEuro("125", 2000);

        ContBancar ce2 = new ContInEuro("126", 2500);

        ContBancar[] leiEuro = {cl1, ce1};

        ContBancar[] euroLei = {ce2, cl2};

        Client c1 = new Client("Popescu Ion", "Timisoara", leiEuro);

        Client c2 = new Client("Popovici Viorel", "Bucuresti", euroLei);

        c1.adaugareContBancar(ce2);

        b1.adaugareClient(c1);

        b1.adaugareClient(c2);

        //System.out.println(c1);

        //System.out.println(c2);

        b1.afisareClient("Popovici Viorel");

        b1.afisareClient("Popescus Ion");

        ((ContInLei) cl1).transfer(cl2, 250);

        System.out.println("\nTransfer intre conturi:\n");

        b1.afisareClient("Popovici Viorel");

        b1.afisareClient("Popescu Ion");

    }

}


