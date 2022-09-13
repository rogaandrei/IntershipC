package Exercitii_din_fisierul_text.Curs10.Ex3;

class Intreg extends TIP {

    private int valoare;

    public Intreg ( int valoare ) {

        this.valoare = valoare;

    }

    public String getTip () {

        return "TIP: Intreg";

    }

    public String toString () {

        return this.valoare + "";

    }

    public boolean equals ( Object o ) {

        if (o instanceof Intreg) {

            return this.valoare == ((Intreg) o).valoare;

        } else

            return false;

    }

}