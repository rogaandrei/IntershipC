package Overloading_Overriding;

public class Academia {
    public static void pass(String studentName){
        System.out.println("Studentul "+ studentName + " a absolvit Academia ");

    }public static void pass(String... studenti){
        for( String studentName:studenti) {
            System.out.println("Studentul " + studentName + " a absolvit Academia ");
        }
    }

    public static void main(String[] args) {
        Academia academia=new Academia();
        academia.pass("Ionut","Marcel");
        academia.pass("Ionut");
    }
}
