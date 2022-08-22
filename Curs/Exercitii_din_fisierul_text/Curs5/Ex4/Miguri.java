package Exercitii_din_fisierul_text.Curs5.Ex4;

public class Miguri extends AvioaneDeLupta {
    public Miguri ( String planeID, int totalEnginePower ) {
        super(planeID, totalEnginePower);
    }

    public String getPlaneID () {
        System.out.println("id-ul migului este de :" + planeID);
        return planeID;
    }

    public int getTotalEnginePower () {
        System.out.println("Avionul migului are puterea de " + totalEnginePower);
        return totalEnginePower;
    }

    @Override
    public void takeOff () {
        System.out.println("Avionul mig aterizeaza");

    }

    @Override
    public void land () {
        System.out.println("Avioanul mig decoleaza");
    }

    @Override
    public void fly () {
        System.out.println("Avioanul mig zboara");
    }

    @Override
    public void launchMissile () {
        System.out.println(planeID + "Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete ");
    }

    public void highSpeedGeometry () {
        System.out.println(planeID + "High speed geometry selected");
    }

    public void normalGeometry () {
        System.out.println(" Normal geometry selected");
    }

}
