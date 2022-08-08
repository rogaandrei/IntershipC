package Pachete.Amusement;

import Pachete.People.Person;

public class DisneyLand extends AmusementPark{
    @Override
    public void greetCustomer ( Person persoana ) {
        System.out.println("Bun venit la parcul de distractii DisneyLand");
        persoana.saluta();
    }
}
