package Pachete.People;

public class American extends  Person{
    public American ( String name ) {
        super(name);
    }

    @Override
    public void saluta () {
        System.out.println("Hello ");
    }
}
