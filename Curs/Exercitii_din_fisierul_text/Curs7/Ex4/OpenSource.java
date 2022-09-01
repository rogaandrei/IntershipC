package Exercitii_din_fisierul_text.Curs7.Ex4;

import java.util.ArrayList;

public class OpenSource extends Project implements Risky{
    String mailingList;
    int members;

    public OpenSource ( String titlu, String obiectiv, ArrayList<Long> fonduri, String mailingList, int members ) {
        super(titlu, obiectiv, fonduri);
        this.mailingList = mailingList;
        this.members = members;
    }

    @Override
    public double getRisk () {
        return members/sum;
    }

    @Override
    public String toString () {
        return "OpenSource{" +
                "mailingList='" + mailingList + '\'' +
                ", members=" + members +
                '}';
    }
}
