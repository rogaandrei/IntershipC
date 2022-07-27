package Mostenire;

public class kidFlash extends Speedster {
    public kidFlash(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void savePerson() {
        System.out.println(name + " salveaza persoana ");
    }
}
