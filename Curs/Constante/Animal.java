package Constante;

public class Animal {
    String name;
    int hungerLevel;

    public Animal(String name, int hungerLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
    }

    public void makeSound(){

}
public final void eat(){
    System.out.println("Animalul mananca");
}

    public static void main(String[] args) {
        Lion lion=new Lion("Leul",200);
        Dog dog=new Dog("Bobic",100);
        Cat cat=new Cat("Cat",50);
        lion.eat();
        dog.eat();
        cat.eat();
        lion.makeSound();
        dog.makeSound();
        cat.makeSound();

    }
}