package Abstractizare.Ex3;

public class Main {
    public static void main ( String[] args ) {
        Bitcoin bitcoin=new Bitcoin(1000);
        Ethereum ethereum=new Ethereum(1000);
        XRP xrp=new XRP(1000);
        for (int i = 0; i < 30; i++) {
            bitcoin.changeValue();
            ethereum.changeValue();
            xrp.changeValue();
            
        }
        System.out.println("Valoarea finala a bitcoinului este de: " +bitcoin.valueInUSD);
        System.out.println("Valoarea finala a ethereumului este de: " +ethereum.valueInUSD);
        System.out.println("Valoarea finala a xrpului este de: " +xrp.valueInUSD);
    }
    
    
}
