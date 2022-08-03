package Constante;

public class Car {
    String name;
    String model;
    boolean on;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
        on = false;
    }

    public final void startEngine()
    {
    if(!on){
        on=true;
        System.out.println("Masina a pornit");
    }else{
        System.out.println("Masina este deja pornita");
    }
    }
    public final void stopEngine()
    {
        if(on){
        on=false;
        System.out.println("Masina s-a oprit");
    }else{
        System.out.println("Masina este deja oprita");
    }
    }
    public void accelerate()
    {
        System.out.println("Masina accelereaza");
    }

    public static void main(String[] args) {
        Bmw bmw=new Bmw("Bmw","X5");
        Dacia dacia=new Dacia("Dacia","Logan");
        Mercedes mercedes=new Mercedes("Mercedes","X5");
        bmw.startEngine();
        bmw.stopEngine();
        bmw.accelerate();
        dacia.startEngine();
       dacia.stopEngine();
       dacia.accelerate();
        mercedes.startEngine();
        mercedes.startEngine();
        mercedes.stopEngine();
        mercedes.accelerate();
    }
}
