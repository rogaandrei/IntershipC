package Exercitii_din_fisierul_text.Curs7.Ex3;

import java.util.ArrayList;

public class Banca extends Client {
    String codBannca;
    ArrayList<Client>clienti=new ArrayList<>();

    public Banca ( String nume, String adresa ) {
        super(nume, adresa);
    }


    public void add(Client c){
        System.out.println("Am adaugat un nou client " +c);
    }
    public void afisareClient(String nume){
        System.out.println("Clientul " + nume + "are adresa " + adresa + "si conturile " + conturi);
    }
}
