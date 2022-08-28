package Exercitii_din_fisierul_text.Curs7.Ex4;

public class Project {
    String titlu;
    String obiectiv;
    long fonduri;

    public Project ( String titlu, String obiectiv, long fonduri ) {
        this.titlu = titlu;
        this.obiectiv = obiectiv;
        this.fonduri = fonduri;
    }

    public void addMember( Member m){
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
