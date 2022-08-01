package Polimorfism;

public class CapucinoMaker extends CoffeMaker{
    public void addMilk(){
        System.out.println("Am adugat lapte");
    }
    public void addSugar(){
        System.out.println("Am adugat zahar");
    }

    @Override
    public void prepareCoffe() {
        System.out.println("preparam capucino");
        addCoffe();
        addMilk();
        addSugar();
    }
}
