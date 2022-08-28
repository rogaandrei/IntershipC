package Exercitii_din_fisierul_text.Curs7.Ex3;

public class ContInLei extends ContBancar implements SumaTotala{
    public ContInLei ( String numarCont, float suma ) {
        super(numarCont, suma);
    }

    public void transfer( ContBancar contDestinatie, float suma){
        System.out.println("Am transferat:" + suma + "catre contul:"+contDestinatie);

    }

    @Override
    public float getSumaTotala () {
        return suma;
    }
}
