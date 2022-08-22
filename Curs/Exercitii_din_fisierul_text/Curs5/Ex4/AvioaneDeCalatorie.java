package Exercitii_din_fisierul_text.Curs5.Ex4;

public class AvioaneDeCalatorie extends Avion {
    int maxPassagers;

    public AvioaneDeCalatorie ( String planeID, int totalEnginePower ) {
        super(planeID, totalEnginePower);
    }

    public String getPlaneID (  ) {
        System.out.println("id-ul avionului este de :" + planeID);
        return planeID;
    }

    public int getTotalEnginePower (  ) {
        System.out.println("Avionul are puterea de " + totalEnginePower);
        return totalEnginePower;
    }

    @Override
    public void takeOff () {
        System.out.println("Avioanele de calatori aterizeaza");

    }

    @Override
    public void land () {
        System.out.println("Avioanele de calatori decoleaza");
    }

    @Override
    public void fly () {
        System.out.println("Avioanele de calatori zboara");
    }

    public int getMaxPassagers () {
        System.out.println("Nr de pasageri este de: "+maxPassagers);
        return maxPassagers;
    }

}
