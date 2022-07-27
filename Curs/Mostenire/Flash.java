package Mostenire;

public class Flash extends Speedster{
    public Flash(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void timeTravel(){
        System.out.println(name + " calatoreste in timp ");
    }
}
