package Exercitii_din_fisierul_text.Curs5.Ex4;

public class Tomcaturi extends AvioaneDeLupta {
    public Tomcaturi ( String planeID, int totalEnginePower ) {
        super(planeID, totalEnginePower);
    }

    public String getPlaneID () {
        System.out.println("id-ul tomcatului este de :" + planeID);
        return planeID;
    }

    public int getTotalEnginePower () {
        System.out.println("Avionul tomcatului are puterea de " + totalEnginePower);
        return totalEnginePower;
    }

    public void launchMissile () {
        System.out.println(planeID + " Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete ");
    }

    @Override
    public void takeOff () {
        System.out.println("Avionul tomcat aterizeaza");

    }

    @Override
    public void land () {
        System.out.println("Avioanul tomcat decoleaza");
    }

    @Override
    public void fly () {
        System.out.println("Avioanul tomcat zboara");
    }

    public void refuel () {
        System.out.println(planeID + "- Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }
}
