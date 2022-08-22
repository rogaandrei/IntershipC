package Exercitii_din_fisierul_text.Curs5.Ex4;

public class Concorde extends AvioaneDeCalatorie {
    public Concorde ( String planeID, int totalEnginePower, int maxPassagers ) {
        super(planeID, totalEnginePower);
    }

    public String getPlaneID () {
        System.out.println("id-ul concordului este de :" + planeID);
        return planeID;
    }

    public int getTotalEnginePower () {
        System.out.println("Avionul concordului are puterea de " + totalEnginePower);
        return totalEnginePower;
    }

    @Override
    public void takeOff () {
        System.out.println("Avionul concorde aterizeaza");

    }

    @Override
    public void land () {
        System.out.println("Avioanul concorde decoleaza");
    }

    @Override
    public void fly () {
        System.out.println("Avioanul concorde zboara");
    }

    public int getMaxPassagers () {
        System.out.println("Nr de calatori ai concordului este de:" + maxPassagers);
        return maxPassagers;
    }

    public void goSuperSonic () {
        System.out.println(planeID + "-Supersonic mode activated");

    }

    public void goSubSonic () {
        System.out.println(planeID + "- Supersonic mode deactivated");
    }
}