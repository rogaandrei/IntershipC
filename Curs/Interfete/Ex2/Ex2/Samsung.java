package Interfete.Ex2.Ex2;

public class Samsung implements SmartphoneBehavior {

    @Override
    public void suna ( String telephoneNumber ) {
        System.out.println("Smartphone-ul Samsung suna la "+telephoneNumber);
    }

    @Override
    public void charge () {
        System.out.println("Smartphone-ul Samsung se incarca");
    }

    @Override
    public void makeScreenshot () {
        System.out.println("Smartphone-ul Samsung face screenshot");
    }

    @Override
    public void downloadApp ( String appName ) {
        System.out.println("Smartphone-ul Samsung descarca aplicatia: " +appName);
    }


}
