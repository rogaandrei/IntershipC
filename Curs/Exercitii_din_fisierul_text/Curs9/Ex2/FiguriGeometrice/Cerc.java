package Exercitii_din_fisierul_text.Curs9.Ex2.FiguriGeometrice;


public class Cerc extends FiguraGeometrica {

    private double raza;

    public Cerc ( Punct O, double raza ) {

        super(O);

        this.raza = raza;

    }

    public double getRaza () {

        return raza;

    }

    @Override
    public String toString () {
        return null;
    }

    @Override
    public boolean equals ( Object o ) {
        return false;
    }
}
