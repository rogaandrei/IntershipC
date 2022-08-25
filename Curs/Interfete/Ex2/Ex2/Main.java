package Interfete.Ex2.Ex2;

public class Main {
    public static void main ( String[] args ) {
        Nokia nokia=new Nokia();
        Motorola motorola=new Motorola();
        Samsung samsung=new Samsung();
        Iphone iphone=new Iphone();
        nokia.charge();
        nokia.suna("012345");
        motorola.charge();
        motorola.suna("12345");
        samsung.charge();
        iphone.downloadApp("Lalaland");
        samsung.suna("123456");
        iphone.makeScreenshot();
    }
}
