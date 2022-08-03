package Constante;

public class DatePersonale {
    public final static String nume="Balea";
    public final static String prenume="Ion";
    public final  static String adresa="Timisoara";



    public static void main(String[] args) {

        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(adresa);
       // DatePersonale.nume="Marcel";
    }

    @Override
    public String toString() {
        return "DatePersonale{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
