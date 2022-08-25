package Interfete.Ex3.Ex1;

public class Unitate implements Startable,Stopable {
    String marca;
    int ram;
    boolean on;

    public Unitate ( String marca, int ram ) {
        this.marca = marca;
        this.ram = ram;
        on=false;
    }

    @Override
    public void start () {
        if(on){
            System.out.println("Calculatorul este deja pornit");
        }else{
            System.out.println("Calculatorul s-a pornit");
            on=true;
        }
        //System.out.println("Unitatea" + marca +"cu capacitatea" + ram + "a pornit " );
    }

    @Override
    public void staop () {
        if(on){
            System.out.println("Am oprit calculatorul");
            on=false;
        }else{
            System.out.println("Calculatorul este deja oprit");

        }
    }

    @Override
    public String toString () {
        return "Unitate{" +
                "marca='" + marca + '\'' +
                ", ram=" + ram +
                ", on=" + on +
                '}';
    }
}
