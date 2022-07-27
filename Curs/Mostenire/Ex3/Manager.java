package Mostenire.Ex3;

public class Manager extends Staff {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void raiseSalary(Staff staff, int amount) {
        staff.salary += amount;
        System.out.println("Am crescut salariul angajatului " +staff.name+ " cu suma de: " +amount);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
