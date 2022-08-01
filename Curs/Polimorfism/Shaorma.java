package Polimorfism;

public class Shaorma {
    public void adaugaCarne(){
        System.out.println("Am adaugat carne");
    }
    public void adaugaCartofi(){
        System.out.println("Am adaugat cartofi");
    }
    public void adaugaSalate(){
        System.out.println("Am adaugat salate");
    }
    public void PregatesteShaorma(){
        System.out.println("Am pregatit shaorma");
    }

    public static void main(String[] args) {
        Shaormadulce shaormad=new Shaormadulce();
        ShaormaPicanta shaormap=new ShaormaPicanta();
        shaormad.PregatesteShaorma();
        System.out.println("");
        shaormap.PregatesteShaorma();
    }
}
