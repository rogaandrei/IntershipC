package Clase;

public class Student {
    String name;
    int age;
    String telephone;
    public Student(String name, int age,String telephone) {

        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    public static void main(String[]args) {
        Student student1=new Student("John",20,"01234567");
        //student.name="john";
        //student.age=20;
        //System.out.println(student.name);
        //System.out.println(student.age);
        student1.call();

    }
    public void call(){
        String number = "098765432";
        System.out.println("Studentul:" + name + "are varsta:" +age+ "si nr.de telefon:" +telephone+ "a facut un call catre:" +number);
    }}
//@Override
//public String toString() {
//	return "Student [name=" + name + ", age=" + age + "]";
//}
