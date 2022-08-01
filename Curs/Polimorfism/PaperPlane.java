package Polimorfism;

public class PaperPlane extends Plane{
    @Override
    public void fly() {
        System.out.println("Avionul zboara incet");
    }

    public PaperPlane() {
        super(0);
    }
}
