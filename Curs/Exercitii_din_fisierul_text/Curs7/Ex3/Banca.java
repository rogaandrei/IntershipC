package Exercitii_din_fisierul_text.Curs7.Ex3;

import java.util.ArrayList;

public class Banca {
    private int numarClienti = 0;

    private Client[] clienti = new Client[100];

    private String codBanca;

    public String getCodBanca () {

        return codBanca;

    }

    public void setCodBanca ( String codBanca ) {

        this.codBanca = codBanca;

    }

    public void adaugareClient ( Client c ) {

        if (numarClienti < clienti.length) {

            clienti[numarClienti] = c;

            numarClienti++;

        } else {

            Client[] tmp = new Client[clienti.length + 100];

            for (int i = 0; i < clienti.length; i++)

                tmp[i] = clienti[i];

            clienti = tmp;

            clienti[numarClienti] = c;

            numarClienti++;

        }

    }

    public void afisareClient ( String nume ) {

        int gasit = 0;

        for (int i = 0; i < numarClienti; i++) {

            if (clienti[i].getNume().equals(nume)) {

                System.out.println(clienti[i]);

                gasit = 1;

            }

        }

        if (gasit == 0) {

            System.out.println("Clientul " + nume + " nu a fost gasit");

        }

    }
}
