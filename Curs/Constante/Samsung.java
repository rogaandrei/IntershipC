package Constante;

public class Samsung extends Phone{
    @Override
    public void downloadApp(String appName) {
        System.out.println("Telefonul Samsung descarca aplicatia " + appName);
    }
}
