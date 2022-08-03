package Constante;

public class Phone {
    String brand;
    String model;
    public final void makeCall(String phoneNumber){
        System.out.println("Am sunat la numarul: " + phoneNumber);
    }
    public void downloadApp(String appName){
        System.out.println("Am descarcat aplicatia " +appName);
    }

    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        Iphone iphone=new Iphone();
        Huawei huawei=new Huawei();
        samsung.downloadApp("Free Fire");
        iphone.downloadApp("Free Fire");
        huawei.downloadApp("Free Fire");
        samsung.makeCall("098765");
        iphone.makeCall("0987654");
        huawei.makeCall("098765");
    }
}
