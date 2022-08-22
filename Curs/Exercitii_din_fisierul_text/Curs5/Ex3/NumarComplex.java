package Exercitii_din_fisierul_text.Curs5.Ex3;

public class NumarComplex {

    protected double re, im;

    public NumarComplex ( double re, double im ) {
        this.re = re;
        this.im = im;
    }

    public NumarComplex adunare ( NumarComplex a ) {
        return new NumarComplex(re + a.re, im + a.im);
    }
    public  void inmultire(NumarComplex b){

    }
    public double modul () {
        return Math.sqrt(re * re + im * im);
    }

    public String toString () {
        return re + " + " + im + " * i";
    }

    public static void test ( NumarComplex x ) {
        if (x instanceof NumarReal)
            System.out.println("NumarReal");
        else
            System.out.println("NumarComplex");
    }

    public static void main ( String argv[] ) {
        NumarComplex a = new NumarComplex(1, 1);
        NumarReal b = new NumarReal(5, 1);

        System.out.println("Suma este:" + a.adunare(b));

        test(a); //Se va tipari NumarComplex
        test(b); //Se va tipari NumarReal
    }

////Se obtine aceeasi suma si astfel
//        System.out.println("Suma este:" + b.adunare(a));
}


