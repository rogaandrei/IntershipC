package Exercitii_din_fisierul_text.Curs10.Ex3;

public class Main {
    public static void main ( String[] args ) {

        TIP c1 = new Colectie();

        ((Colectie) c1).add(new Intreg(7));

        ((Colectie) c1).add(new Intreg(4));

        ((Colectie) c1).add(new Sir("Eu"));

        ((Colectie) c1).add(new Intreg(12));

        System.out.println("Colectia 1: " + c1);

        TIP c2 = new Colectie();

        ((Colectie) c2).add(new Intreg(7));

        ((Colectie) c2).add(new Intreg(4));

        ((Colectie) c2).add(new Sir("Eu"));

        ((Colectie) c2).add(new Intreg(12));

        System.out.println("Colectia 2: " + c2);

        System.out.println("Colectiile sunt egale: " + c1.equals(c2));

        ((Colectie) c1).add(c2);

        System.out.println("Colectia mare " + c1);

    }
}
