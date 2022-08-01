package Polimorfism;

public class Shaormadulce extends Shaorma{
    public void adaugaKetchupDulce(){
        System.out.println("Am adaugat carne");
    }

    @Override
    public void PregatesteShaorma() {
        adaugaCarne();
        adaugaCartofi();
        adaugaSalate();
        adaugaKetchupDulce();
        System.out.println("Am pregatit shaorma dulce");
    }
}
