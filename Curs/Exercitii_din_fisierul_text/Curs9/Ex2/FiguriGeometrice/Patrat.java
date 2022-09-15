package Exercitii_din_fisierul_text.Curs9.Ex2.FiguriGeometrice;


public class Patrat extends FiguraGeometrica {

    private Punct P;

    public Patrat ( Punct O, Punct P ) {

        super(O);

        this.P = P;

    }

    public Punct getP () {

        return P;

    }

    public double getLatura () {


        return 0;
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

