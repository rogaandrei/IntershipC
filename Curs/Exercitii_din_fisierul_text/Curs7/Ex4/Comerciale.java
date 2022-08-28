package Exercitii_din_fisierul_text.Curs7.Ex4;

public class Comerciale extends Project implements Risky{
    String deadline;
    int members;
    long fonduriDeMarketing;
    int numarEchipe;

    public Comerciale ( String titlu, String obiectiv, long fonduri, String deadline, int members, long fonduriDeMarketing, int numarEchipe ) {
        super(titlu, obiectiv, fonduri);
        this.deadline = deadline;
        this.members = members=15;
        this.fonduriDeMarketing = fonduri/2;
        this.numarEchipe=numarEchipe;
    }

    @Override
    public double getRisk () {
        return (numarEchipe*3)/members/fonduriDeMarketing;
    }

    @Override
    public String toString () {
        return "Comerciale{" +
                "deadline='" + deadline + '\'' +
                ", members=" + members +
                ", fonduriDeMarketing=" + fonduriDeMarketing +
                ", numarEchipe=" + numarEchipe +
                '}';
    }
}
