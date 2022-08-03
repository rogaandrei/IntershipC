package Constante;

public class Huawei extends Phone{
    @Override
    public void downloadApp(String appName) {
        System.out.println("Telefonul Huawei descarca aplicatia " + appName);
    }
}
