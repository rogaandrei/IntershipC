package Mostenire;

public class Batman extends Hero {
    public Batman(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void useGadgets() {
        System.out.println(name + " foloseste gadgeturi");
    }
}
