package Incapsulare;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamMachine {
    ArrayList<String> arome = new ArrayList<>(Arrays.asList("Vanilie", "Ciocolata", "Capsuni"));

    public void prepareIceCream ( String desiredFlavor ) {
        boolean exists = false;
        for (String aroma : arome) {
            if (desiredFlavor.equalsIgnoreCase(aroma)) {//se foloseste equalsIgnoreCase pentru a ignora majusculele
                exists = true;
            }
        }
        if (exists) {
            System.out.println("Inghetata voastra cu aroma de " + desiredFlavor + " a fost preparata");
        } else {
            System.out.println("Aroma dvs. nu exista");
        }
    }

    public void addFlavor ( String newFlavor ) {
        arome.add(newFlavor);
    }

}
