package metodestatice;

import java.util.ArrayList;

public class Employee {
    static int rang=500;
    String name;
    int age;
    ArrayList<String> soldProducts=new ArrayList<>();

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;

    }
    public static void main(String[] args) {
        Employee angajat1=new Employee("Aureel",20);
        Employee angajat2=new Employee("Aurica",29);
        Employee angajat3=new Employee("Auras",22);
        angajat1.sellProducts("Cartofi");
        angajat2.sellProducts("Peste");
        angajat3.sellProducts("Ardei");
        System.out.println(angajat1);
        System.out.println(angajat2);
        System.out.println(angajat3);
        System.out.println(Employee.rang);

    }
    public void sellProducts(String productName) {
        soldProducts.add(productName);
        rang++;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", soldProducts=" + soldProducts + "]";
    }

}
