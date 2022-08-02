package Overloading_Overriding;

public class Prcesator_de_asigurari extends  Asigurare {


    public static void proceseaza(Asigurare asigurare){
        System.out.println("Asigurarea " + asigurare + "a fost procesata ");

    }
    public static void proceseaza(Asigurare asigurare,boolean approvedByManager){
        //if(approvedByManager=true) {
           // System.out.println("Asigurarea " + asigurare + "a fost procesata ");
        //}else{
            //System.out.println("Asigurarea " + asigurare + "nu a fost procesata ");
       // }
        System.out.println((approvedByManager?"":"NU")+ "am procesta asigurarea " + asigurare);
    }

    public static void main(String[] args) {
//        Prcesator_de_asigurari prcesator_de_asigurari=new Prcesator_de_asigurari("12223");
//        prcesator_de_asigurari.proceseaza();
        Prcesator_de_asigurari.proceseaza(new Asigurare());
        Prcesator_de_asigurari.proceseaza(new Asigurare(),true);
        Prcesator_de_asigurari.proceseaza(new Asigurare(),false);
    }
}
