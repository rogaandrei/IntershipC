package Constante;

public class Bmw extends Car{
    public Bmw(String name, String model) {
        super(name, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Bmw accelereaza rapid");
    }
}
