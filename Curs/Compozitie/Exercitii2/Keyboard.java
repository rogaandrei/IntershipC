package Compozitie.Exercitii2;

public class Keyboard {
    String brand;
    int price;

    public Keyboard(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
