package Mostenire;

public class Speedster extends Hero {
    public Speedster(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void speedRun() {
        System.out.println(name + " foloseste speedrun ");
    }
}
