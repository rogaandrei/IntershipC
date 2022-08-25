package Interfete.Ex3.Ex1;

public class Main {
    public static void main ( String[] args ) {
        Radio radio=new Radio("RadioFm");
        Pc pc=new Pc("Philips",8);
        Laptop laptop=new Laptop("Victus",16);
        radio.start();
        radio.staop();
        radio.changeCurrentPost("Radio Noroc");
        System.out.println(radio);
        laptop.start();
        pc.staop();
        System.out.println(laptop);
        System.out.println(pc);
    }

}
