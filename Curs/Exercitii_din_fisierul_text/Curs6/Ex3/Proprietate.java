package Exercitii_din_fisierul_text.Curs6.Ex3;

public abstract class Proprietate {
    protected String strada;

    protected int nr;

    protected float suprafata;


    public void Proprietate( String strada, int nr, float suprafata){

        this.strada=strada;

        this.nr=nr;

        this.suprafata=suprafata;

    }
    public abstract float cost(float suprafata);

    public abstract String getFluturas();

}

