package Exercitii_din_fisierul_text.Curs3.Ex2;

public class Main {
    public static void main ( String[] args )

    {
        Carte carte = new Carte(12);
        Carte carte12 = new Carte(12);
        Carte carte13=carte;//pentru equals default
        if(carte.equals(carte12)) {
            System.out.println("Numarul de pagini este identic");
        } else {
            System.out.println("Numarul de pagini este diferit");
        }

    }}
