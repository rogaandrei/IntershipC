package Mostenire;
public class Dog extends Animal{
public  Dog(String name, int age) {
        super(name, age);

        }

public void bark(){
        System.out.println("Ham ham ham");
        }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
