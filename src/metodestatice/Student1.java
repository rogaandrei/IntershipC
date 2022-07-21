package metodestatice;

import java.util.ArrayList;
import java.util.Arrays;

public class Student1 {
    String name;
    int grade;
    static String school;

    public Student1(String name, int grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student1 [name=" + name + ", grade=" + grade + ", school= " + school+ "]";
    }

    public static void main(String[] args) {
        Student1 student1=new Student1("Ion",10);
        Student1 student2=new Student1("Boris",5);
        Student1 student3=new Student1("Gheorghe",7);
        Student1 student4=new Student1("Snejana",1);
        Student1 student5=new Student1("Nadejda",8);
        Student1 student6=new Student1("Mihai",9);
        Student1 student7=new Student1("Varvara",3);
        Student1 student8=new Student1("Natalia",2);
        Student1 student9=new Student1("Aghis",6);
        Student1 student10=new Student1("Iura",4);
        ArrayList<Student1> student=new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10));
        Student1.ChangeSchoolName("Scoala primara");
        System.out.println(student);

    }
    public static void printDetails(ArrayList<Student1> studenti) {
        for (Student1 student:studenti) {
            System.out.println(student);
        }
    }
    public static void ChangeSchoolName(String newName) {
        school=newName;
    }
}
