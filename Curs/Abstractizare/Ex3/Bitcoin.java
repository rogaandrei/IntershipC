package Abstractizare.Ex3;

public class Bitcoin extends CryptoCurrency{
    public Bitcoin ( double valueInUSD ) {
        super(valueInUSD);
    }

    @Override
    public void changeValue () {
    int probabilitate=generator.nextInt(11);
    if(probabilitate<=4){
        valueInUSD-=80.0;
        System.out.println("Valoarea bitcoinului a scazut cu 80");
    }else{
        valueInUSD+=100;
        System.out.println("Valoarea bitcoinului a crescut cu 100");
    }
    }
}
