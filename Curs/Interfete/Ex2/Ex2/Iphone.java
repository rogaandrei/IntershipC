package Interfete.Ex2.Ex2;

public class Iphone implements SmartphoneBehavior {


    @Override
    public void suna ( String telephoneNumber ) {
        System.out.println("Smartphone-ul Iphone suna la:" + telephoneNumber);
    }

    @Override
    public void charge () {
        System.out.println("Smartphone-ul Iphone se incarca");
    }

    @Override
    public void makeScreenshot () {
        System.out.println("Smartphone-ul Iphone face screenshot");
    }

    @Override
    public void downloadApp ( String appName ) {
        System.out.println("Smartphone-ul Iphone descarca aplicatia " + appName);
    }


}
