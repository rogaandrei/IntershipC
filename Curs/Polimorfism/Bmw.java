package Polimorfism;

public class Bmw extends Car{
    public Bmw(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Dacia a ajuns la viteza maxima in 10 de secunde");
    }
}
