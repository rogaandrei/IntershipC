package Exercitii_din_fisierul_text.Curs2.Ex2;

public class Ex2 {
    private int a;
    private char b;

    public Ex2(int a, char b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Ex2 ex2=new Ex2(12,'a');
        System.out.println(ex2);
    }

    @Override
    public String toString() {
        return "Ex2{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
