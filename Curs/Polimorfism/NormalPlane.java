package Polimorfism;

public class NormalPlane extends Plane{
    public NormalPlane(int maxPassagers) {
        super(maxPassagers);
    }

    @Override
    public void fly() {
        System.out.println("Avionul zboara cu viteza normala");
    }
}
