package Constante;

public class Iphone extends Phone{
    @Override
    public void downloadApp(String appName) {
        System.out.println("Telefonul Iphone descarca aplicatia " + appName);
    }
}
