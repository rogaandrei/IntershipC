package Clase;

public class AirConditioner {
    boolean on;
    int temperature;
    boolean swinging;


    public static void main(String[] args) {
        AirConditioner conditioner=new AirConditioner();

        conditioner.turnOn();
        conditioner.swing();
        conditioner.raiseTemperature();
        conditioner.raiseTemperature();
        System.out.println(conditioner);

    }
    public void turnOn() {
        if(on) {
            System.out.println("conditionerul este deja aprins ");
        }else {
            System.out.println("conditionerul s-a aprins");
            on=true;
        }
    }
    public void turnOff() {
        if(on) {
            System.out.println("conditionerul s-a stins");
            on=false;

        }else {
            System.out.println("conditionerul este deja stins");
        }
    }
    public void raiseTemperature() {
        if(on){
            if(temperature==30) {
                System.out.println("Temperatura este ridicata la maxim");
            }else {
                System.out.println("Ati marit temperatura");
                temperature++;
            }
        }else {
            System.out.println("Porniti conditionerul/este stins");
        }
    }
    public void lowerTemperature() {
        if(on) {
            if(temperature==0) {
                System.out.println("temperatura este la minim");
            }else {
                System.out.println("ati micsorat temperatura");
                temperature--;
            }}else {
            System.out.println("Porniti conditionerul/este stins");}
    }
    public void swing() {
        if(on) {
            if (swinging) {
                System.out.println("Am oprit conditionerul din balansat");
                swinging=false;
            }else {
                System.out.println("Am pornit balansul");
                swinging=true;
            }
        }else {
            System.out.println("Porniti conditionerul/este stins");
        }
    }
    @Override
    public String toString() {
        return "AirConditioner [on=" + on + ", temperature=" + temperature + ", swinging=" + swinging + "]";

    }

}