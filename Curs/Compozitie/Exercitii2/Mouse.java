package Compozitie.Exercitii2;

public class Mouse {
    String brand;
    String color;
    int price;

    public Mouse(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
