package Constante;

public class Cat extends Animal{
    public Cat(String name, int hungerLevel) {
        super(name, hungerLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("Pisica miauna");
    }
}
