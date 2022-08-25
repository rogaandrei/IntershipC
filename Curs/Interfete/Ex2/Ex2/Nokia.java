package Interfete.Ex2.Ex2;

public class Nokia implements TelephoneBehavior {


    @Override
    public void suna ( String telephoneNumber ) {
        System.out.println("Telefonul Nokia suna la " +telephoneNumber);
    }

    @Override
    public void charge () {
        System.out.println("Telefonul Nokia  se incarca");
    }
}
