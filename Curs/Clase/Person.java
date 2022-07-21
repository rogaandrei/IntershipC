package Clase;

public class Person {
    String name;
    String sex;
    String adress;
    int age;

    public Person(String name, String sex, String adress, int age) {
        super();
        this.name = name;
        this.sex = sex;
        this.adress = adress;
        this.age = age;
    }
    public static void main(String[] args) {
        Person baiat=new Person("Mirolin","masculin","tipa",20);
        Person fata=new Person("Mirolina","feminin","tipas",21);
        baiat.walk();
        baiat.eat();
        baiat.sleep();
        baiat.show();
        fata.sleep();
        fata.walk();
        fata.eat();
        fata.show();

    }
    public void walk() {
        System.out.println(this.name + " merge");
    }
    public void eat() {
        System.out.println(this.name + " mananca");

    }
    public void sleep() {
        System.out.println(this.name+  " doarme");

    }
    public void show(){
        System.out.println("salut ma numesc:"+name+" sunt:"+sex+" locuiesc in:"+adress+" am:"+age);}
}
