package Exercitii_din_fisierul_text.Curs2.Ex5;

public class ClientComplex extends Complex {
    String name;

    public ClientComplex ( double real, double imaginar, String name ) {
        super(real, imaginar);
        this.name = name;
    }

    public static void main ( String[] args ) {
        ClientComplex clientComplex=new ClientComplex(24,12,"Ion");
        Complex complex2 = new Complex(13, 19);
        clientComplex.calculeaza();
        clientComplex.calculeaza();
        clientComplex.afsiValoare();
        clientComplex.afsiValoare();
        clientComplex.suma(complex2);
        clientComplex.afiseaza();
    }
}
