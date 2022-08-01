package Polimorfism;

public class Mercedes extends Car{
    public Mercedes(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Dacia a ajuns la viteza maxima in 15 de secunde");
    }
}
