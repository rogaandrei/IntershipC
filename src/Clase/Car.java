package Clase;



public class Car {
    String brand;
    String model;
    int year;
    boolean on;

    public Car(String brand, String model, int year, boolean on) {
        super();
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public static void main(String[] args) {
        Car masina=new Car("BMW","X5",2020,false);
        masina.StartEngine();
        masina.StopEngine();
        masina.PrintDetails();
        masina.StareInterna();
        masina.StartEngine();
        masina.StartEngine();
    }
    public void StartEngine() {
        if(on) {
            System.out.println(brand+ "este deja pornita");}
        else {
            System.out.println((brand+ " a pornit"));
            on=true;
        }

    }
    public void StopEngine() {
        if(on) {
            System.out.println(brand +  "s-a oprit");
            on=false;}
        else {
            System.out.println((brand+  "este deja oprita"));
        }

    }
    public void PrintDetails() {
        System.out.print("Masina"  + brand +  ", este");
        System.out.println(on? "pornita":"oprita");
    }
    public void StareInterna() {

    }



}
