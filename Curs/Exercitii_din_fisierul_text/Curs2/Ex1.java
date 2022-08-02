package Exercitii_din_fisierul_text.Curs2;

public class Ex1 {
    private String a;

    public Ex1(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Ex1 ex1=new Ex1("B");
        System.out.println(ex1);
    }

    @Override
    public String toString() {
        return "Ex1{" +
                "a='" + a + '\'' +
                '}';
    }
}
