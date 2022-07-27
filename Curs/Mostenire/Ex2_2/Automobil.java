package Mostenire.Ex2_2;

public class Automobil {
    String marca;
    String model;
    boolean started;

    public Automobil(String model,String marca) {
        this.model = model;
        this.marca=marca;
        started=false;
    }

    public static void main(String[] args) {
        Autobus autobuz=new Autobus(20,0,"Mercedes","Benz");
        Tesla tesla=new Tesla("Tesla","?",80);
        autobuz.startEngine();
        autobuz.stopEngine();
        autobuz.startEngine();
        autobuz.addPassagers();
        System.out.println(autobuz);

        tesla.startEngine();
        tesla.drive();
        tesla.charge();
        tesla.drive();



        System.out.println(tesla);
    }
    public void startEngine(){
if(started){
    System.out.println("Automobilul este deja pornit");

}else{
    started=true;
    System.out.println("Am pornit automobilul");

}
    }
    public void stopEngine(){
if(started){
    started=false;
    System.out.println("Am oprit automobilul");

}else{
    System.out.println("Automobilul este deja oprit");
}
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public boolean isStarted() {
        return started;
    }
}
