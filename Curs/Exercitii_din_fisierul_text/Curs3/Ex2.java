package Exercitii_din_fisierul_text.Curs3;

public class Ex2 {
    static int nrPagini;

    public Ex2 ( int nr_pagini ) {
        this.nrPagini = nr_pagini;
    }
    public boolean equals(Object o) {
        if(o instanceof Ex2) {
            return (((Ex2) o).nrPagini == nrPagini);
        }else{
        return false;
    }//cu equals suprascris
}

    public static void main ( String[] args )

    {
        Ex2 carte = new Ex2(12);
        Ex2 carte12 = new Ex2(12);
            Ex2 carte13=carte;//pentru equals default
            if(carte.equals(carte12)) {
                System.out.println("Numarul de pagini este identic");
            } else {
                System.out.println("Numarul de pagini este diferit");
            }


    }


}
