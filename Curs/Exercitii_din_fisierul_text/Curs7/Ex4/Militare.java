package Exercitii_din_fisierul_text.Curs7.Ex4;

import java.util.ArrayList;

public class Militare extends Project implements Risky{
    String deadline;
    int members;
    String parola;

    public Militare ( String titlu, String obiectiv, ArrayList<Long> fonduri, String deadline, int members, String parola ) {
        super(titlu, obiectiv, fonduri);
        this.deadline = deadline;
        this.members = members=15;
        this.parola = parola;
    }

    @Override
    public double getRisk () {
//int c= (int) ();
        return (members / parola.length()) /sum;
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
