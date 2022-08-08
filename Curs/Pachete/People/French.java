package Pachete.People;

public class French extends Person{
    public French ( String name ) {
        super(name);
    }

    @Override
    public void saluta () {
        System.out.println("Bonjour");
    }
}
