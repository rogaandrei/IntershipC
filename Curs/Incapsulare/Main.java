package Incapsulare;

public class Main {
    public static void main ( String[] args ) {
        IceCreamMachine iceCreamMachine=new IceCreamMachine();
        iceCreamMachine.prepareIceCream("vanilie");
        iceCreamMachine.prepareIceCream("portocala");
        iceCreamMachine.addFlavor("Scortisoara");
        iceCreamMachine.prepareIceCream("scortisoara");
    }

}
