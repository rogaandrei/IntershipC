package Polimorfism;

public class ShaormaPicanta extends Shaorma{
    public void adaugaKetchupPicant(){
        System.out.println("Am adaugat ketchup picant");
    }
    public void adaugaUsturoi(){
        System.out.println("Am adaugat usturoi");
    }

    @Override
    public void PregatesteShaorma() {
        adaugaCarne();
        adaugaCartofi();
        adaugaSalate();
        adaugaKetchupPicant();
        adaugaUsturoi();
        System.out.println("Am pregatit shaorma picanta");
    }
}
