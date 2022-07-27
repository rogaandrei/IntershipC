package Mostenire.Ex3;

public class Pantaloni extends Haine{
    int nr_buzunare;

    public Pantaloni(String marca, int pret, int nr_buzunare) {
        super(marca, pret);
        this.nr_buzunare = nr_buzunare;
    }

    @Override
    public String toString() {
        return "Pantaloni{" +
                "nr_buzunare=" + nr_buzunare +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
