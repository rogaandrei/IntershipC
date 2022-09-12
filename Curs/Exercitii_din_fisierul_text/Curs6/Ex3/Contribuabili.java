package Exercitii_din_fisierul_text.Curs6.Ex3;

public class Contribuabili {
    private String nume, CNP;

    public Contribuabili ( String nume, String CNP ) {

        this.nume = nume;

        this.CNP = CNP;

    }

    public String getCNP () {

        return CNP;

    }

    private Proprietate[] proprietati = new Proprietate[10];

    private int nr_proprietati = 0;

    private float cost;

    public void adaugaProprietate ( Proprietate p1 ) {

        if (nr_proprietati <= proprietati.length) {

            proprietati[nr_proprietati] = p1;

            nr_proprietati++;

        } else {

            Proprietate[] tmp = new Proprietate[proprietati.length + 10];

            for (int i = 0; i < proprietati.length; i++) {

                tmp[i] = proprietati[i];

            }

            proprietati = tmp;

            proprietati[nr_proprietati] = p1;

        }

    }

    public float getCost () {

        this.cost = 0;

        for (int i = 0; i < nr_proprietati; i++) {

            this.cost = this.cost + proprietati[i].cost(proprietati[i].suprafata);

        }

        return this.cost;

    }

    public String getFluturas () {

        String result = "Contribuabil: " + this.nume + "Proprietati:";

        for (int i = 0; i < nr_proprietati; i++) {

            result = result + proprietati[i].getFluturas();

        }

        result = result + "Suma totala: " + getCost();

        return result;

    }

}

