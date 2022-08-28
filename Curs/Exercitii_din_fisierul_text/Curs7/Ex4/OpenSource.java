package Exercitii_din_fisierul_text.Curs7.Ex4;

public class OpenSource extends Project implements Risky{
    String mailingList;
    int members;

    public OpenSource ( String titlu, String obiectiv, long fonduri, String mailingList, int members ) {
        super(titlu, obiectiv, fonduri);
        this.mailingList = mailingList;
        this.members = members;
    }

    @Override
    public double getRisk () {
        return members/fonduri;
    }

    @Override
    public String toString () {
        return "OpenSource{" +
                "mailingList='" + mailingList + '\'' +
                ", members=" + members +
                '}';
    }
}
