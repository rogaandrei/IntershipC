package Constante;

public class Mercedes extends Car{
    public Mercedes(String name, String model) {
        super(name, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes accelereaza mediu");
    }
}
