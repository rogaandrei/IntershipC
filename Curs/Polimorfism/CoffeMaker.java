package Polimorfism;

public class CoffeMaker {
    public void prepareCoffe(){
        addCoffe();

    }
    public void addCoffe(){
        System.out.println("Am adaugat cafea");
    }

    public static void main(String[] args) {
        CapucinoMaker capucino=new CapucinoMaker();
        EspressoMaker espresso=new EspressoMaker();
        capucino.prepareCoffe();
        espresso.prepareCoffe();
    }
}
