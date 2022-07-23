package Compozitie;

public class Laptop {
   static int idCount=1;
   int id;
   String brand;
   String model;
   Employee anagajat;

   public Laptop(String brand, String model, Employee anagajat) {
      id=idCount++;
      this.brand = brand;
      this.model = model;
      this.anagajat = anagajat;
   }

   public static void main(String[] args) {
      Employee angajat1=new Employee("Ionescu","Oleg");
      Employee angajat2=new Employee("Filipescu","Filip");
      Laptop laptop1=new Laptop("Victus","Hp",angajat1);
      Laptop laptop2=new Laptop("Victus","Hp",angajat2);
      //for(int i=0;i<3;i++){
        // idCount++;
      //}
      System.out.println(laptop1);
      System.out.println(laptop2);
   }

   @Override
   public String toString() {
      return "Laptop{" +
              "brand='" + brand + '\'' +
              ", model='" + model + '\'' +
              ", anagajat=" + anagajat +
              ", id='" + id + '\'' +
              '}';
   }
}
////Fiecare angajat are cate un laptop ,ci nu invers:))