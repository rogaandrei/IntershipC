package metodestatice;

public class Person {
    static int contor=0;
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        contor++;
    }

    public static void main(String[] args) {
        Person persoana1=new Person("Calariu","Ioana");
        Person persoana2=new Person("Calota","Valentin");
        System.out.println(persoana1);
        System.out.println(persoana2);
        System.out.println(Person.contor);
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName +"]";
    }



}
