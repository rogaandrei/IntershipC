package Exercitii_din_fisierul_text.Curs3;

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
        return a + b + c;
    }

    // returneaza suma dintre a, b, c si d
    public static int suma(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Suma suma1 = new Suma();
        suma1.suma(10, 20);

        System.out.println(" ");
        suma1.suma(10, 20, 30);

        System.out.println(" ");
        suma1.suma(10, 20, 19, 11);

        System.out.println(" ");
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
