package Mostenire.Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void main(String[] args) {
        ArrayList<Premiant> premianti = new ArrayList<>(Arrays.asList(
                new Premiant("Tudor", 10),
                new Premiant("Maria", 10),
                new Premiant("Maxim", 10)

        ));

        ArrayList<StudentNormal> normali = new ArrayList<>(Arrays.asList(
                new StudentNormal("Anatol", 8),
                new StudentNormal("Cristina", 6),
                new StudentNormal("Ioana", 7)
        ));
        ArrayList<Corigent> corigenti = new ArrayList<>(Arrays.asList(
                new Corigent("Igor", 4),
                new Corigent("Ion", 3),
                new Corigent("Liviu", 4)
        ));
        for(Premiant premiant:premianti){
            premiant.multumeste();
        }
        for(StudentNormal studentNormal:normali){
            studentNormal.citeste();
        }
        for (Corigent corigent:corigenti){
            corigent.invata();

        }
    }
}
