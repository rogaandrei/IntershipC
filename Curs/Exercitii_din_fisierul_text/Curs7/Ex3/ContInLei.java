package Exercitii_din_fisierul_text.Curs7.Ex3;

public class ContInLei extends ContBancar implements SumaTotala {


    public ContInLei ( String numarCont, float suma ) {
        super(numarCont, suma);
    }

    public void transfer ( ContBancar contDestinatie, float suma ) {

        if (contDestinatie instanceof ContInLei) {

            contDestinatie.suma = contDestinatie.suma + suma;

            super.suma = super.suma - suma;

        } else {

            System.out.println("Transferurile se pot face numai intre conturile in lei.");

        }

    }

    public float getSumaTotala () {

        return super.suma;

    }

}