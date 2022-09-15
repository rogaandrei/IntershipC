package Exercitii_din_fisierul_text.Curs9.Ex2.FiguriGeometrice;


public abstract class FiguraGeometrica {

    private Punct O;

    public FiguraGeometrica () {

    }

    public FiguraGeometrica ( Punct O ) {

        this.O = O;

    }

    public Punct getO () {

        return O;

    }

    abstract public String toString ();

    public abstract boolean equals ( Object o );

}
