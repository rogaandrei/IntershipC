package Mostenire.Ex3;

public class Adidasi extends Haine{
    boolean sireturi;

    public Adidasi(String marca, int pret, boolean sireturi) {
        super(marca, pret);
        this.sireturi = sireturi;
    }

    @Override
    public String toString() {
        return "Adidasi{" +
                "sireturi=" + sireturi +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }



}
