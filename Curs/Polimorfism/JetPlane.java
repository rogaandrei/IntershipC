package Polimorfism;

public class JetPlane extends Plane{
    public JetPlane() {
        super(2);
    }

    @Override
    public void fly() {
        System.out.println("JetPlane-ul zboara cu viteza mare");
    }
}
