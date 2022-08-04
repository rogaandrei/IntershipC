package Exercitii_din_fisierul_text.Curs2;

public class Ex5 {
    int nrComplexe=0;
    double real;
    double imaginar;

    public Ex5 ( double real, double imaginar ) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public void calculeaza (double i) {
        Math.sqrt(real*real+imaginar*imaginar);
        System.out.println("Numarul complex este: "+(real+i*imaginar));
    }
    public void suma(Ex5 complex){
        System.out.println(complex);
    }
    public void afiseaza(){
        System.out.println("Numerele complexe a fost afisat de:" + nrComplexe++);


    }

    public static void main ( String[] args ) {
        Ex5 ex5=new Ex5(20,15);
        ex5.calculeaza(12);
        //ex5.afiseaza();ex5.suma();
    }}
