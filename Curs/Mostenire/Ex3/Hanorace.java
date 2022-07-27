package Mostenire.Ex3;

public class Hanorace extends Haine{
    boolean gluga;

    public Hanorace(String marca, int pret, boolean gluga) {
        super(marca, pret);
        this.gluga = gluga;
    }

    @Override
    public String toString() {
        return "Hanorace{" +
                "gluga=" + gluga +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
