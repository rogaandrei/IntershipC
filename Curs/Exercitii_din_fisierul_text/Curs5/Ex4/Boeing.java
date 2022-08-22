package Exercitii_din_fisierul_text.Curs5.Ex4;

public class Boeing extends AvioaneDeCalatorie {
    public Boeing ( String planeID, int totalEnginePower, int maxPassagers ) {
        super(planeID, totalEnginePower);
    }

    public String getPlaneID () {
        System.out.println("id-ul boeingului este de :" + planeID);
        return planeID;
    }

    public int getTotalEnginePower () {
        System.out.println("Avionul boeing are puterea de " + totalEnginePower);
        return totalEnginePower;
    }

    @Override
    public void takeOff () {
        System.out.println("Avionul boeing aterizeaza");

    }

    @Override
    public void land () {
        System.out.println("Avioanul boeing decoleaza");
    }

    @Override
    public void fly () {
        System.out.println("Avioanul boeing zboara");
    }

    @Override
    public int getMaxPassagers () {
        System.out.println("Nr de calatori ai boengului este de:" + maxPassagers);
        return maxPassagers;
    }
}
