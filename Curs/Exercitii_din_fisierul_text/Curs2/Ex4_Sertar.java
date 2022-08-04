package Exercitii_din_fisierul_text.Curs2;

public class Ex4_Sertar  {
    int lungime;
    int latime;
    int inaltime;

    public Ex4_Sertar ( int lungime, int latime, int inaltime ) {

        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void tipareste () {
        System.out.println("Sertar : " + lungime + " " + latime + " " + inaltime);
    }

    public static void main ( String[] args ) {
        Ex4_Sertar ex4_sertar = new Ex4_Sertar(10, 12, 20);
        ex4_sertar.tipareste();
        Ex4_Birou sertar1 = new Ex4_Birou(10,20,30);
        Ex4_Birou sertar2=new Ex4_Birou(10,20,30);
        sertar1.tipareste();
        sertar2.tipareste();
    }

}
