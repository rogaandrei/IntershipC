package Constante;

public class Dacia extends Car{
    public Dacia(String name, String model) {
        super(name, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Dacia accelereaza incet");
    }
}
