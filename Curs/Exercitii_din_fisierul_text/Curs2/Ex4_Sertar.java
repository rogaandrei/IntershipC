package Exercitii_din_fisierul_text.Curs2;

public class Ex4_Sertar extends Ex4_Birou{
    int lungime;
    int latime;
    int inaltime;

    public Ex4_Sertar(int lungime, int latime, int inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void tipareste(){
        System.out.println("Suma este: " +(lungime+latime+inaltime));
    }

    public static void main(String[] args) {
Ex4_Sertar ex4_sertar=new Ex4_Sertar(10,12,20);
        System.out.println(ex4_sertar);
        ex4_sertar.tipareste();
//        Ex4_Birou ex4_birou=new Ex4_Birou();
//        ex4_birou.tipareste();
    }

    @Override
    public String toString() {
        return "Ex4_Sertar{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                '}';
    }
}
