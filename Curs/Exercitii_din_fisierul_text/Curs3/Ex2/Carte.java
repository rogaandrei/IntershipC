package Exercitii_din_fisierul_text.Curs3.Ex2;

public class Carte {
    static int nrPagini;

    public Carte ( int nr_pagini ) {
        this.nrPagini = nr_pagini;
    }

    public boolean equals ( Object o ) {
        if (o instanceof Carte) {
            return (((Carte) o).nrPagini == nrPagini);
        } else {
            return false;
        }//cu equals suprascris
    }


}



