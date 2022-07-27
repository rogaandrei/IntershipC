package Mostenire.Ex3;

public class Staff {
    String name;
    int salary;

    public Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Programator programator1=new Programator("Andrei",8000);
        Cleaner cleaner=new Cleaner("Elena",2000);
        TeamLeader teamLeader=new TeamLeader("Aurel",10000);
        Manager manager=new Manager("Mihai",12000);
        programator1.code();
        cleaner.clean();
        teamLeader.addProgramators(new Programator("Igor",7000));
        teamLeader.assignWork();
        manager.raiseSalary(programator1,2000);
        System.out.println(cleaner);
        System.out.println(teamLeader);
        System.out.println(manager);
        System.out.println(programator1);

    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
