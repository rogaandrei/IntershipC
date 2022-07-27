package Mostenire.Ex3;

public class Cleaner extends Staff{
    public Cleaner(String name, int salary) {
        super(name, salary);
    }

    public void clean(){
        System.out.println("Cleanerul " +this.name+ " face curatenie ");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
