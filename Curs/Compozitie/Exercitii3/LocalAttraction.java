package Compozitie.Exercitii3;

public class LocalAttraction {
    String name;
    int coordinateX;
    int coordinateY;

    public LocalAttraction(String name, int coordinateX, int coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "LocalAttraction{" +
                "name='" + name + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
