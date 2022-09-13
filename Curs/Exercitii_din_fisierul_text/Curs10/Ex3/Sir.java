package Exercitii_din_fisierul_text.Curs10.Ex3;

class Sir extends TIP{

    private String continut;

    public Sir(String continut){

        this.continut=continut;

    }

    public String getTip() {

        return "TIP: Sir";

    }

    public String toString() {

        return continut;

    }

    public boolean equals(Object o) {

        if(o instanceof Sir){

            return this.continut.equals(((Sir)o).continut);

        }

        else

            return false;

    }

}