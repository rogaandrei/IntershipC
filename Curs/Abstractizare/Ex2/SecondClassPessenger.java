package Abstractizare.Ex2;

public class SecondClassPessenger extends Passenger{
    public SecondClassPessenger ( String name ) {
        super(name);
    }

    @Override
    public void useBenefits () {
        System.out.println(name + " a primit Alune");
    }
}
