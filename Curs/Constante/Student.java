package Constante;

public class Student {
    final String name;
    int year;
    final String major;

    public Student(String name, String major) {
        this.name = name;
        year = 1;
        this.major = major;
    }

    public void passYear() {
        if(year<3){
            System.out.println("Studentul a trecut anul: " + ++year);
        }else{
            System.out.println("Studentul a absolvit");
        }

    }

    public static void main(String[] args) {
        Student student=new Student("Marcel","Da");
        Student student1=new Student("Marcel","Da");
student.passYear();
        student.passYear();
        student.passYear();
student1.passYear();

    }
}
