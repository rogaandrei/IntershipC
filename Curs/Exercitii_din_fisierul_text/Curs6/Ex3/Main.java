package Exercitii_din_fisierul_text.Curs6.Ex3;

public class Main {

    public static void main ( String[] args ) {

        Contribuabili c1 = new Contribuabili("Ion Popescu", "123");

        Proprietate p1 = new Cladire("V Parvan", 2, 20);

        Proprietate p2 = new Teren("V Parvan", 2, 10, 1);

        Proprietate p3 = new Cladire("Lugoj", 4, 25);

        c1.adaugaProprietate(p1);

        c1.adaugaProprietate(p2);

        c1.adaugaProprietate(p3);

        Contribuabili c2 = new Contribuabili("Geoge Constantinescu", "124");

        Proprietate p11 = new Cladire("Mihai Viteazul", 3, 100);

        Proprietate p22 = new Teren("Mihai Viteazul", 4, 150, 2);

        c2.adaugaProprietate(p11);

        c2.adaugaProprietate(p22);


    }

}
