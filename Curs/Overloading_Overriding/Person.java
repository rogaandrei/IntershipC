package Overloading_Overriding;

import javax.swing.*;

public class Person {
    static String name;

    public Person(String name) {
        this.name = name;
    }

    public static void eat(String aliment1) {
        System.out.println(name + " mananca " + aliment1);
    }

    public static void eat(String aliment1, String aliment2) {
        System.out.println(name + " mananca " + aliment1 + " si " + aliment2);
    }

    public static void eat(String aliment1, String aliment2, String aliment3) {
        System.out.println(name + " mananca " + aliment1 + " , " + aliment2 + " si " + aliment3);
    }

    public static void main(String[] args) {
        Person persoana = new Person("Ion");
        persoana.eat("Rosii");
        persoana.eat("Rosii", "Castraveti");
        persoana.eat("Rosii", "Castraveti", "Paine");
    }

}
