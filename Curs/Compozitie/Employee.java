package Compozitie;

public class Employee {
    String nume;
    String prenume;

    public Employee(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}
