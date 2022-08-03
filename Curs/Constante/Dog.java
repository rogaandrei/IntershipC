package Constante;

public class Dog extends Animal{
    public Dog(String name, int hungerLevel) {
        super(name, hungerLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("Cainele latra");
    }
}
