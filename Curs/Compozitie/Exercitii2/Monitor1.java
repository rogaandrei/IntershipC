package Compozitie.Exercitii2;

public class Monitor1 {
    String brand;
    int diagonala;
    int price;

    public Monitor1(String brand, int diagonala, int price) {
        this.brand = brand;
        this.diagonala = diagonala;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", diagonala=" + diagonala +
                ", price=" + price +
                '}';
    }
}
