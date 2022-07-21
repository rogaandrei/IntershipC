package Clase;



public class main {

    public static void main(String[] args) {
        PC calculator=new PC(16,"intel");
        Monitor monitor=new Monitor(16);
        calculator.pressPowerButton();
        monitor.pressPowerButton();
        calculator.pressPowerButton();
        monitor.pressPowerButton();
    }

}
