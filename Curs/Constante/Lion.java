package Constante;

public class Lion extends Animal{
    public Lion(String name, int hungerLevel) {
        super(name, hungerLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("Leul racneste");
    }
}
