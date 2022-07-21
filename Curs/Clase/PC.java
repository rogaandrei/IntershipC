package Clase;

public class PC {
    boolean on;
    int ram;
    String procesor;
    public PC( int ram, String procesor) {
        super();

        this.ram = ram;
        this.procesor = procesor;
    }
    public void pressPowerButton() {
        if(!on) {
            System.out.println("am pornit calculatorul");
            on=true;
        }else {
            System.out.println("am stins calculatorul");
            on=false;
        }
    }}
