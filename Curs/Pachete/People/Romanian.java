package Pachete.People;

public class Romanian extends Person{
    public Romanian ( String name ) {
        super(name);
    }

    @Override
    public void saluta () {
        System.out.println("Salut");
    }
}
