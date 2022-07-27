package Mostenire;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }






    public static void main(String[] args) {
      // Animal animal=new Animal("Pisica",10);
        Dog dog =new Dog("Bobic",5);
        dog.eat();
        dog.bark();
        System.out.println(dog);
        Cat cat =new Cat("Ducesa",3);
        cat.eat();
        cat.miau();
        System.out.println(cat);
        Parrot parrot=new Parrot("Kesha",2);
        parrot.eat();
        parrot.talk("Hello ");
        System.out.println(parrot);
    }
    public void eat(){
        System.out.println(name+ " a mancat");
    }
}
