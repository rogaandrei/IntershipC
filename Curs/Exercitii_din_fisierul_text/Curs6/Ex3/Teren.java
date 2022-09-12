package Exercitii_din_fisierul_text.Curs6.Ex3;

class Teren extends Proprietate {

    private int rang;

    public Teren ( String strada, int nr, float suprafata, int rang ) {

        super(strada, nr, suprafata);

        this.rang = rang;

    }

    public float cost ( float suprafata ) {

        return 350 * super.suprafata / this.rang;

    }

    public String getFluturas () {

        String result = "";

        result = result + "Teren:   Strada " + super.strada + " Nr. " + super.nr + "\n\t\t" +

                " Suprafata  " + super.suprafata + " Rang " + this.rang +

                "\n\t\t Cost " + cost(super.suprafata) + "\n";

        return result;

    }

}
