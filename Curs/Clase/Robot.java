package Clase;

import java.util.ArrayList;
import java.util.Scanner;

public class Robot {
    String nume;
    int attackPower;
    String material;

    public Robot(String nume, int attackPower, String material) {
        super();
        this.nume = nume;
        this.attackPower = attackPower;
        this.material = material;
    }
    public static void main(String[] args) {
//	Robot robot1=new Robot("asd",100,"fier");
//	Robot robot2=new Robot("asdr",43,"titan");
//	Robot robot3=new Robot("asde",134,"wolfram");
//	Robot robot4=new Robot("asdw",56,"aluminiu");
//	Robot robot5=new Robot("asdt",67,"otel");
        ArrayList<Robot>roboti=new ArrayList<>() ;
        Scanner scText=new Scanner(System.in);//pentru a introduce date de la tastatura(in cazul dat litere)
        Scanner scNumber=new Scanner(System.in);//pentru a introduce date de la tastatura(in cazul dat cifre)
        for(int i=0;i<5;i++) { //executa aceasta bucla de 5 ori
            System.out.println("Introduceti numele robotului:");
            String nume=scText.nextLine();//numele va fi incapsulat in variabila string (nume)
            System.out.println("Introduceti puterea robotului:");
            int valoare=scNumber.nextInt();
            System.out.println("Introduceti materialul robotului:");
            String material=scText.nextLine();
            roboti.add(new Robot(nume,valoare,material));
        }

//	roboti.add(robot1);
//	roboti.add(robot2);
//	roboti.add(robot3);
//	roboti.add(robot4);
//	roboti.add(robot5);
        for(Robot robot:roboti) {
            robot.attack();
        }
    }
    public void attack() {
        System.out.println(nume+" a atacat cu valoarea "+attackPower);

    }
}