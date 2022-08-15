package Abstractizare.Ex2;

import org.w3c.dom.ls.LSOutput;

public class ThirdClassPessenger extends Passenger{

    public ThirdClassPessenger ( String name ) {
        super(name);
    }

    @Override
    public void useBenefits () {
        System.out.println(name + " a primit Spatiu");
    }
}
