package Exercitii_din_fisierul_text.Curs7.Ex4;

public class Member {
    int varsta;
    String nume;

    public Member ( int varsta, String nume ) {
        this.varsta = varsta;
        this.nume = nume;
    }

    @Override
    public String toString () {
        return "Member{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                '}';
    }
}
