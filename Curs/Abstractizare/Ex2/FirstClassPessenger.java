package Abstractizare.Ex2;

public class FirstClassPessenger extends Passenger{
    public FirstClassPessenger ( String name ) {
        super(name);
    }

    @Override
    public void useBenefits () {
        System.out.println(name + " a primit Sampanie");
    }
}
