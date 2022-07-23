package Compozitie.Exercitii2;

public class Calculator {
    String brand ;
    int price;
    Mouse mouse;
    Keyboard keyboard;
    Monitor1 monitor;

    public Calculator(String brand, int price, Mouse mouse, Keyboard keyboard, Monitor1 monitor) {
        this.brand = brand;
        this.price = price;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public static void main(String[] args) {
        Calculator calculator =new Calculator("Victus",4000,new Mouse("Tech","Black",100),new Keyboard("Tech",200),new Monitor1("Hp",100,2000));
        System.out.println(calculator);
        calculator.PrintTotalPrice();
    }
    public void PrintTotalPrice(){
        int totalprice=this.price+keyboard.price+monitor.price+mouse.price;
        System.out.println("Pretul total este de " +totalprice);
    }
}
