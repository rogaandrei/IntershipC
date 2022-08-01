package Polimorfism;

import java.util.ArrayList;
import java.util.Arrays;

public class Plane {
    int maxPassagers;

    public Plane(int maxPassagers) {
        this.maxPassagers = maxPassagers;
    }

    public void fly(){
        System.out.println("Avionul zboara");
    }

    public static void main(String[] args) {
        ArrayList<Plane> avioane=new ArrayList<>(Arrays.asList(
                new JetPlane(),
                new NormalPlane(32),
                new PaperPlane()
        ));
        for(Plane avion:avioane){
            avion.fly();
        }
    }
}
