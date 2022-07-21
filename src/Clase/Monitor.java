package Clase;

public class Monitor {

    boolean on;
    double diagonala;

    public Monitor( double diagonala) {
        super();

        this.diagonala = diagonala;
    }






    public void pressPowerButton() {
        if(!on) {
            System.out.println("am pornit monitorul");
            on=true;
        }else {
            System.out.println("am stins monitorul");
            on=false;
        }
    }}

