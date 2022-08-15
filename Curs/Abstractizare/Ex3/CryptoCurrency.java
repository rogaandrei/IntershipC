package Abstractizare.Ex3;

import java.util.Random;

public abstract class CryptoCurrency {
    double valueInUSD;
    protected Random generator = new Random();

    public CryptoCurrency ( double valueInUSD ) {
        this.valueInUSD = valueInUSD;
    }

    public abstract void changeValue ();
}
