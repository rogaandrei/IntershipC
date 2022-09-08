package Exercitii_din_fisierul_text.Curs7.Ex3;


abstract class ContBancar implements SumaTotala {

    protected String numarCont;

    protected float suma;

    public ContBancar ( String numarCont, float suma ) {

        this.numarCont = numarCont;

        this.suma = suma;

    }

    public abstract float getSumaTotala ();

    public void setNumarCont ( String numarCont ) {

        this.numarCont = numarCont;

    }

    public void setSuma ( float suma ) {

        this.suma = suma;

    }

    public float getSuma () {

        return suma;

    }

    public String getNumarCont () {

        return numarCont;

    }

}
