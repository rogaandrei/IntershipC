package Clase;

public class Aragaz {
    boolean isGasConnected;
    boolean eyeOneIsLit;
    boolean eyeTwoIsLit;
    boolean eyeThreeIsLit;
    boolean eyeFourIsLit;

    public static void main(String[] args) {
        Aragaz aragaz=new Aragaz();

        aragaz.coupleGas();
        aragaz.pressFirtsEyeButton();

        aragaz.pressSecondEyeButton();
        aragaz.pressThirdEyeButton();
        aragaz.pressForthEyeButton();
    }
    public void coupleGas() {
        if(isGasConnected) {
            System.out.println("Gazul este deja conectat");
        }else {
            isGasConnected=true;
            System.out.println("Am conecatat/am aprins gazul");

        }
    }
    public void decoupleGas() {
        if(isGasConnected) {
            isGasConnected=false;
            System.out.println("Am deconecatat/am stins gazul");
        }else {

            System.out.println("Gazul este deja deconectat");

        }
    }
    public void pressFirtsEyeButton() {
        if (eyeOneIsLit) {
            System.out.println("Ochiul 1 s-a stins");
            eyeOneIsLit=false;

        }else {
            if(isGasConnected) {
                System.out.println("ochiul 1 s-a aprins");
                eyeOneIsLit=true;
                allPressed();
            }else {
                System.out.println("Gazul nu este pornit");

            }
        }
    }
    public void pressSecondEyeButton() {
        if (eyeTwoIsLit) {
            System.out.println("Ochiul 2 s-a stins");
            eyeTwoIsLit=false;

        }else {
            if(isGasConnected) {
                System.out.println("ochiul 2 s-a aprins");
                eyeTwoIsLit=true;
                allPressed();
            }else {
                System.out.println("Gazul nu este pornit");

            }
        }

    }
    public void pressThirdEyeButton() {
        if (eyeThreeIsLit) {

            System.out.println("Ochiul 3 s-a stins");
            eyeThreeIsLit=false;
        }else {
            if(isGasConnected) {
                System.out.println("ochiul 3 s-a aprins");
                eyeThreeIsLit=true;
                allPressed();

            }else {
                System.out.println("Gazul nu este pornit");

            }
        }
    }
    public void pressForthEyeButton() {
        if (eyeFourIsLit) {

            System.out.println("Ochiul 4 s-a stins");
            eyeFourIsLit=false;

        }else {
            if(isGasConnected) {
                System.out.println("ochiul 4 s-a aprins");
                eyeFourIsLit=true;
                allPressed();
            }else {
                System.out.println("Gazul nu este pornit");

            }
        }
    }
    public void allPressed() {
        if(eyeOneIsLit &&eyeTwoIsLit&&eyeThreeIsLit&&eyeFourIsLit) {//daca toate sunt aprinse
            System.out.println("Toate ochiurile sunt aprinse/aragazul se va stinge");
            eyeOneIsLit=false;//toate ochiurile devin false//adica se sting
            eyeTwoIsLit=false;
            eyeThreeIsLit=false;
            eyeFourIsLit=false;
            decoupleGas();//apelam metoda pentru a stinge gazul
        }
    }
}
