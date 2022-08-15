package Abstractizare.Ex3;

public class Ethereum extends CryptoCurrency {
    public Ethereum ( double valueInUSD ) {
        super(valueInUSD);
    }

    @Override
    public void changeValue () {
        int probabilitate = generator.nextInt(11);
        if (probabilitate <= 4) {
            valueInUSD -= 80.0;
            System.out.println("Valoarea ethereumului a scazut cu 80");
        } else {
            valueInUSD += 100;
            System.out.println("Valoarea ethereumului a crescut cu 100");
        }
    }
}

