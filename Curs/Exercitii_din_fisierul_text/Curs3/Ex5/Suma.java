package Exercitii_din_fisierul_text.Curs3.Ex5;

public class Suma {
    int a;
    int b;
    int c;
    int d;

    // returneaza suma dintre a si b
    public static int suma(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    //returneaza suma dintre a, b si c
    public static int suma(int a, int b, int c) {
        System.out.println(a + b + c);
        return suma(a,b) + c;
    }

    // returneaza suma dintre a, b, c si d
    public static int suma(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
        return suma(a,b,c) + d;
    }



    @Override
    public String toString() {
        return "Suma{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
