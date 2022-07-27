package Mostenire;

public class Parrot extends Animal{
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void talk(String whatToSay){
        System.out.println(whatToSay);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
