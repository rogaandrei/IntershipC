package Compozitie;

public class Engine {
    int capacity;

    public Engine(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                '}';
    }
}
