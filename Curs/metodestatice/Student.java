package metodestatice;

public class Student {
    static int contor=1;
    int id;
    String name;

    public Student( String name) {
        super();
        id=Student.contor++;
        //Student.contor++;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student1=new Student("Ion");
        Student student2=new Student("Boris");
        Student student3=new Student("Gheorghe");
        Student student4=new Student("Snejana");
        Student student5=new Student("Nadejda");
        Student student6=new Student("Mihai");
        Student student7=new Student("Varvara");
        Student student8=new Student("Natalia");
        Student student9=new Student("Aghis");
        Student student10=new Student("Iura");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);
        System.out.println(student9);
        System.out.println(student10);


    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}