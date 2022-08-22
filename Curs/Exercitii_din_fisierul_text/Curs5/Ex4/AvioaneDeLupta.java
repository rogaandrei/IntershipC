package Exercitii_din_fisierul_text.Curs5.Ex4;

public class AvioaneDeLupta extends Avion {
    public AvioaneDeLupta ( String planeID, int totalEnginePower ) {
        super(planeID, totalEnginePower);
    }


    public String getPlaneID () {
        System.out.println("id-ul avionului este de :" + planeID);
        return planeID;
    }

    public int getTotalEnginePower () {
        System.out.println("Avionul are puterea de " + totalEnginePower);
        return totalEnginePower;
    }

    @Override
    public void takeOff () {
        System.out.println("Avioanele de lupta aterizeaza");

    }

    @Override
    public void land () {
        System.out.println("Avioanele de lupta decoleaza");
    }

    @Override
    public void fly () {
        System.out.println("Avioanele de lupta zboara");
    }

    public void launchMissile () {
        System.out.println("Avionul de lupta a lansat racheta");
    }
}
