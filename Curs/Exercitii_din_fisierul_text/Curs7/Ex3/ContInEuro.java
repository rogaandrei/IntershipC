package Exercitii_din_fisierul_text.Curs7.Ex3;

public class ContInEuro extends ContBancar implements SumaTotala {
    float dobanda = 0;
double c;
    public ContInEuro ( String numarCont, float suma ) {
        super(numarCont, suma);
    }

    public float getDobanda (  ) {
        if (suma > 500) {
            c = dobanda + 0.3;
        }else if(suma<500){
            c=dobanda+0;
        }
        return (float) c;
    }

    @Override
    public float getSumaTotala () {
        return (float) (suma*36.000);
    }
}
