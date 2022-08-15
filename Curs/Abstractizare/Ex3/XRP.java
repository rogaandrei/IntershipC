package Abstractizare.Ex3;

public class XRP extends CryptoCurrency {
    public XRP ( double valueInUSD ) {
        super(valueInUSD);
    }

    @Override
    public void changeValue () {
        int probabilitate = generator.nextInt(11);
        if (probabilitate <= 2) {
            valueInUSD -= 30.0;
            System.out.println("Valoarea XRPului a scazut cu 80");
        } else {
            valueInUSD += 10.0;
            System.out.println("Valoarea XRPului a crescut cu 100");
        }
    }
}

