package Exercitii_din_fisierul_text.Curs7.Ex3;

public class ContInEuro extends ContBancar implements SumaTotala {


    private static final int PragMinimDobanda = 500;

    private static final float DobandaFixa = (float) 0.3;

    public ContInEuro ( String numarCont, float suma ) {

        super(numarCont, suma);

    }

    public float getDobanda () {

        if (super.suma > PragMinimDobanda)

            return DobandaFixa;

        else

            return 0;

    }

    public float getSumaTotala () {

        return 36000 * super.suma;

    }

}