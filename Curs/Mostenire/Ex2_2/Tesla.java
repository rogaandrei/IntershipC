package Mostenire.Ex2_2;

public class Tesla extends Automobil{
    int BatteryPercentage;

    public Tesla(String model,String marca, int batteryProcentage) {
        super(model,marca);
        BatteryPercentage = 100;
    }
    public void drive(){
        if(BatteryPercentage>=10){
        System.out.println("Masina merge");
        BatteryPercentage-=10;
    }else{
        System.out.println("Nu mai avem baterie");
    }}
    public void charge(){
        BatteryPercentage=100;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "BatteryPercentage=" + BatteryPercentage +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", started=" + started +
                '}';
    }
}
