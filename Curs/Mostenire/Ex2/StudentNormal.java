package Mostenire.Ex2;

public class StudentNormal extends Student{
    public StudentNormal(String name, int grade) {
        super(name, grade);
    }
    public void citeste(){
        System.out.println(name+ " citeste ");
    }
}
