package Exercitii_din_fisierul_text.Curs10.Ex3;


import java.util.ArrayList;

class Colectie extends TIP{

        private ArrayList<TIP> colectie=new ArrayList<TIP>(5);

        public String getTip() {

            return "TIP: Colectie";

        }

        public String toString() {

            return colectie+"";

        }

        public boolean equals(Object o){

            boolean isEqual=true;

            if(o instanceof Colectie){

                if(((Colectie)o).colectie.size()!=this.colectie.size()) {

                    isEqual = false;

                }

                else{

                    for(int i=0;i<colectie.size();i++){

                        if(!colectie.get(i).equals(((Colectie)o).colectie.get(i))) {

                            isEqual = false;

                            break;

                        }

                    }

                }

            }

            else

                isEqual=false;

            return isEqual;

        }

        public void add(TIP[] tip){

            for(int i=0;i<tip.length;i++){

                if(tip[i]==null){

                    System.out.println("Nu se poate adauga elementul");

                    break;

                }

                colectie.add(i,tip[i]);

            }

        }

        public void add(TIP tip){

            if(tip==null)

                System.out.println("Nu se poate adauga elementul");

            else

                colectie.add(tip);

        }

    }

