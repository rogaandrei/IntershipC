package Abstractizare.Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main ( String[] args ) {
        ArrayList<Passenger> pasageri = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pasageri.add(new FirstClassPessenger("Ion"+i));
                    pasageri.add(new SecondClassPessenger("Elena"+i));
                    pasageri.add(new ThirdClassPessenger("Marcel"+i));
        }
            for(Passenger passenger:pasageri){
                passenger.useBenefits();
            }

    }
}
