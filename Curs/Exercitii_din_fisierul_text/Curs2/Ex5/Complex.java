package Exercitii_din_fisierul_text.Curs2.Ex5;

public class Complex {
    static int nrComplexe = 0;
    double real;
    double imaginar;

    public Complex ( double real, double imaginar ) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public void calculeaza () {
        double radical = Math.sqrt(real * real + imaginar * imaginar);
        System.out.println(radical);
    }

    public void afsiValoare () {
        System.out.println("Numarul complex este: " + real + "+i*" + imaginar);
        nrComplexe++;
    }

    public void suma ( Complex c ) {


            real=real+c.real;
            imaginar=imaginar+c.imaginar;//adunarea numerelor complexe curente +primite ca parametru
        System.out.println("Suma nr.reale complexe sunt: " +real);
        System.out.println("Suma nr.imaginare complexe sunt: " +imaginar);
    }

    public void afiseaza () {

        System.out.println("Numerele complexe a fost afisat de:" + nrComplexe);


    }


}
