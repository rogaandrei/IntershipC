package Polimorfism;

import java.util.Scanner;

public class EspressoMaker extends CoffeMaker {
  //  boolean yes=true;
    Scanner sc=new Scanner(System.in);
    public void addMilk(){
        System.out.println("Doriti lapte?");
        String raspuns=sc.nextLine();
        if(raspuns.equals("yes")){
            System.out.println("Am adugat lapte");

    }else if(raspuns.equals("no")){
        System.out.println("fara lapte");
    }else{
        System.out.println("Nu ai introdus un raspuns existent/yes/no");
    }
       /* if (yes){
            System.out.println("Am adugat lapte");
        }else{
            System.out.println("Fara lapte");
        }*/
    }

    @Override
    public void prepareCoffe() {
        System.out.println("preparam espresso");
        addCoffe();
        addMilk();
        makeitDouble();


    }
    public void makeitDouble(){
        System.out.println("Doriti dublu?");
        String raspuns=sc.nextLine();

        if(raspuns.equals("yes")){
            addCoffe();
            System.out.println("Am facut dublu");
        }else if(raspuns.equals("no")){
            System.out.println("simplu");
        }else{
            System.out.println("Nu ai introdus un raspuns existent/yes/no");
        }
       /* if (yes){
            System.out.println("L-am facut dublu");
        }else{
            System.out.println("Nu l-am facut dublu");
        }*/
    }
}
