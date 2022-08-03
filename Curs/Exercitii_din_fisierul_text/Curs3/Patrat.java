package Exercitii_din_fisierul_text.Curs3;

public class Patrat {
    int latura;
    int aria;

    public Patrat(int l) {
        latura=l;

    }

    public Patrat() {
        latura = 10;
    }
    public void Atas(int l){
        latura=l;
        System.out.println("Patrat " + latura + " Aria " +(l+l+l+l));
    }

    public static void main(String[] args) {
        Patrat patrat=new Patrat();
        Patrat patrat1=new Patrat();
        patrat.Atas(10);
        patrat1.Atas(20);
    }
}
