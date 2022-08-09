package Exercitii_din_fisierul_text.Curs2.Ex4;

import java.util.ArrayList;

public class Birou {
    int lungime;
    int latime;
    int inaltime;

    Sertar sertar1;
    Sertar sertar2;

    public Birou ( int lungime, int latime, int inaltime ) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void tipareste(){

        System.out.println("Componentele biroului sunt:   lungime: " +lungime+ " latime: " +latime+ " inaltime: " +inaltime);
        sertar1.tipareste1();
        sertar2.tipareste1();
    }
}
