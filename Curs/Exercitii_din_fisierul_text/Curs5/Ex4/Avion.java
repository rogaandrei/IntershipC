package Exercitii_din_fisierul_text.Curs5.Ex4;

public class Avion {
    String planeID;
    int totalEnginePower;

    public Avion ( String planeID, int totalEnginePower ) {
        this.planeID = planeID;
        this.totalEnginePower = totalEnginePower;
    }

    public String getPlaneID () {

        return planeID;
    }

    public int getTotalEnginePower () {

        return totalEnginePower;
    }

    public void takeOff () {
        System.out.println("Avionul aterizeaza");
    }

    public void land () {
        System.out.println("Avionul decoleza");
    }

    public void fly () {
        System.out.println("Avionul zboara");
    }
}
