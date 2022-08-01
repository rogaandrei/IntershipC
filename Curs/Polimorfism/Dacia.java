package Polimorfism;

public class Dacia extends Car{
    public Dacia(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Dacia a ajuns la viteza maxima in 20 de secunde");
        crushEngine();
    }
    public void crushEngine(){

            System.out.println("A picat motorul");

    }
}
