package Mostenire.Ex3;

public class Programator extends Staff{
    public Programator(String name, int salary) {
        super(name, salary);
    }

    public void code(){
        System.out.println("Programatorul  " +this.name+ " scrie cod ");
    }

    @Override
    public String toString() {
        return "Programator{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
