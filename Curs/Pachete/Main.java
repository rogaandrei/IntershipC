package Pachete;

import Pachete.Amusement.DisneyLand;
import Pachete.Amusement.EdenLand;
import Pachete.People.American;
import Pachete.People.French;
import Pachete.People.Person;
import Pachete.People.Romanian;

public class Main {
    public static void main ( String[] args ) {
      American person1=new American("Ion");
        Romanian person2=new Romanian("John");
        French person3=new French("Jean");
        DisneyLand disneyLand=new DisneyLand();
        EdenLand edenLand=new EdenLand();
   disneyLand.greetCustomer(person1);

        disneyLand.greetCustomer(person2);

        disneyLand.greetCustomer(person3);

        edenLand.greetCustomer(person1);

        edenLand.greetCustomer(person2);

        edenLand.greetCustomer(person3);

    }
}
