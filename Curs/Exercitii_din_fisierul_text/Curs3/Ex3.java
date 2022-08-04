package Exercitii_din_fisierul_text.Curs3;

public class Ex3 {
    int latura;
    int aria;

    public Ex3 ( int l) {
        latura=l;

    }

    public Ex3 () {
        latura = 10;
    }
//    public void Atas(int l){
//        latura=l;
//        System.out.println("Patrat " + latura + " Aria " +(l+l+l+l));
//    }

    public static void main(String[] args) {
        Ex3 patrat=new Ex3();
        Ex3 patrat1=new Ex3();
//        patrat.Atas(10);
//        patrat1.Atas(20);
        System.out.println(patrat);
        System.out.println(patrat1);
    }

    @Override
    public String toString () {
        return "Ex3{" +
                "Patrat=" + latura +
                ", aria=" + +(latura+latura+latura+latura) +
                '}';
    }
}
