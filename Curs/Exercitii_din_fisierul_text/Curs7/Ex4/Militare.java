package Exercitii_din_fisierul_text.Curs7.Ex4;

public class Militare extends Project implements Risky{
    String deadline;
    int members;
    String parola;

    public Militare ( String titlu, String obiectiv, long fonduri, String deadline, int members, String parola ) {
        super(titlu, obiectiv, fonduri);
        this.deadline = deadline;
        this.members = members=15;
        this.parola = parola;
    }

    @Override
    public double getRisk () {
//int c= (int) ();
        return (members / parola.length()) / fonduri;
    }

    @Override
    public String toString () {
        return "Militare{" +
                "deadline='" + deadline + '\'' +
                ", members=" + members +
                ", parola='" + parola + '\'' +
                '}';
    }
}
