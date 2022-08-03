package Constante;

public class Teacher {
    String name;
    int age;
    static final String subject="Istoria";

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Teacher teacher=new Teacher("Ion",30);
        System.out.println(teacher);
        System.out.println("Preda: " +subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
