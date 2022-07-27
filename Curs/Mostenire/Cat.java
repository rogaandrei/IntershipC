package Mostenire;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void miau(){
        System.out.println("Miau miau miau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}