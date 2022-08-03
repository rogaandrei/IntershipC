package Exercitii_din_fisierul_text.Curs3;

public class Carte {
     static int nr_pagini;

    public Carte(int nr_pagini) {
        this.nr_pagini = nr_pagini;
    }
//    public void ComparareCarte(){
//        if(Carte.nr_pagini==Carte2.nr_pagini){
//            System.out.println("Numar de pagini identice");
//        }else{
//            System.out.println("Numarul de pagini diferit");
//        }
//    }

    public static void main(String[] args) {
        Carte carte=new Carte(12);
        Carte carte12=new Carte(12);
        Carte carte13=new Carte(12);

        //carte1.ComparareCarte();
       // Carte carte13=carte12;
        if(carte.nr_pagini== carte12.nr_pagini){
            System.out.println("Numarul de pagini este identic");
        }else{
            System.out.println("Numarul de pagini este diferit");
        }
        //System.out.println(carte.equals(carte12));
    }
}
