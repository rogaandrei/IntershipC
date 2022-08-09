package Exercitii_din_fisierul_text.Curs3.Ex3;

public class Patrat {
    int latura;
    int aria;

    public Patrat ( int l) {
        latura=l;

    }

    public Patrat () {
        latura = 10;
    }
//    public void Atas(int l){
//        latura=l;
//        System.out.println("Patrat " + latura + " Aria " +(l+l+l+l));
//    }



    @Override
    public String toString () {
        return "Ex3{" +
                "Patrat=" + latura +
                ", aria=" + +(latura*latura) +
                '}';
    }
}
