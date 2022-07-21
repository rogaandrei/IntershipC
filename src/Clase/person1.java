package Clase;

public class person1 {
    String name;
    int height;
    int weight;
    int energy;

    public person1(String name, int height, int weight, int energy) {
        super();
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.energy = energy;
    }
    public static void main(String[] args) {
        person1 persoana=new person1("Aurel",180,80,100);
        persoana.eat();
        persoana.learn();
        persoana.exercise();
        persoana.sleep();
        persoana.sleep();
        persoana.eat();
        persoana.stare();

    }
    public void eat() {
        System.out.println(name+" a mancat");
        weight++;
    }
    public void learn() {
        System.out.println(name+" a invatat");
        energy--;
    }
    public void sleep() {
        System.out.println(name+" a dormit");
        energy++;}
    public void exercise() {
        System.out.println(name+" a exersat");
        energy--;
        weight--;
    }
    public void stare() {
        System.out.println(energy);
        System.out.println(weight);
    }
}
