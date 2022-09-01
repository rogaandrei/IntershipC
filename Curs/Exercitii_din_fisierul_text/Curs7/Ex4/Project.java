package Exercitii_din_fisierul_text.Curs7.Ex4;

import java.util.ArrayList;

public class Project {
    String titlu;
    String obiectiv;
    ArrayList<Long> fonduri;
    int sum = 0, avg;
    public Project ( String titlu, String obiectiv, ArrayList<Long> fonduri ) {
        this.titlu = titlu;
        this.obiectiv = obiectiv;
        this.fonduri = fonduri;
    }
    public void calcFonduri(){
        ArrayList<Long> fonduri = new ArrayList<Long>();
        fonduri.add(2000L);
        fonduri.add(3000L);
       fonduri.add(3000L);
        for(int i = 0; i <fonduri.size(); i++)
            sum += fonduri.get(i);
        avg = sum / fonduri.size();
        System.out.println("The average is: " + avg);
    }

    public void addMember ( Member m ) {
        System.out.println("Am adaugat un membru nou " + m);
    }

    @Override
    public String toString () {
        return "Project{" +
                "titlu='" + titlu + '\'' +
                ", obiectiv='" + obiectiv + '\'' +
                ", fonduri=" + fonduri +
                '}';
    }
}
