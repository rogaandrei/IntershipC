package Polimorfism;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    String model;
    int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void reachMaxSpeed(){
        System.out.println("Ati ajuns la viteza maxima");
     }

    public static void main(String[] args) {
        ArrayList<Car>masini=new ArrayList<>(Arrays.asList(
                new Dacia("Logan",200),new Mercedes("X5",150),new Bmw("X7",180)));
                for(Car masina:masini){
                    masina.reachMaxSpeed();
                }

    }
}
