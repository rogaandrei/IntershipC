package Constante;

public class Tshirt {
    public final static String brand="Versaci";
    int size;
    String color;

    public Tshirt(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public static void main(String[] args) {
        Tshirt tshirt=new Tshirt(20,"albastru");
        System.out.println(tshirt);
        System.out.println(brand);
        //Tshirt.brand="nike";
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
