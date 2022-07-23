package Compozitie.Exercitii3;

import java.util.ArrayList;

public class Elev {
    String nume;
    ArrayList<Integer>note=new ArrayList<>();

    public Elev(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", note=" + note +
                '}';
    }
}
