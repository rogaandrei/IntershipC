package Interfete.Ex2.Ex2;

public class Motorola implements TelephoneBehavior {


    @Override
    public void suna ( String telephoneNumber ) {
        System.out.println("Telefonul Motorola suna la " + telephoneNumber);
    }

    @Override
    public void charge () {
        System.out.println("Telefonul Motorola se incarca");
    }
}
