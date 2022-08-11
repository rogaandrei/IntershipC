package Exercitii_din_fisierul_text.Curs3.Ex3;

public class Patrat {
    int latura;
    int aria;

    public Patrat ( int l ) {
        latura = l;

    }

    public Patrat () {

        latura = 10;
    }


    @Override
    public String toString () {
        return "Ex3{" +
                "Patrat=" + latura +
                ", aria=" + +(latura * latura) +
                '}';
    }
}
