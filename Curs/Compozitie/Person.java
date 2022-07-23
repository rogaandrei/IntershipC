package Compozitie;

public class Person {
    String firstName;
    String lastName;
    BestFrienfd prieten;

    public Person(String firstName, String lastName, BestFrienfd prieten) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.prieten = prieten;
    }

    public static void main(String[] args) {
BestFrienfd pri=new BestFrienfd("Ion");
        Person person =new Person("Cojocaru","Claudiu",pri);
        person.PrintFreindsip();
    }
    public void PrintFreindsip(){
        System.out.println(firstName+ " " +lastName+" este cel mai bun prieten al lui "+prieten.firstName);
    }
}
