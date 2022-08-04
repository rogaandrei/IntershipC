package Exercitii_din_fisierul_text.Curs2;

public class Ex4_Birou {
    int lungime;
    int latime;
    int inaltime;

    public Ex4_Birou ( int lungime, int latime, int inaltime ) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void tipareste(){
        System.out.println("Componentele biroului sunt: "+lungime+ " " +latime+ " " +inaltime);
    }
}
