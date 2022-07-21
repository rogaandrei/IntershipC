package Clase;

public class Phone {
    String brand;
    String model;
    int storage;

    public Phone(String brand, String model, int storage) {
        super();
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    public static void main(String[] args) {
        Phone telefon1=new Phone("Samsung","S9",8);
        Phone telefon2=new Phone("Samsung","S8",4);
        Phone telefon3=new Phone("Samsung","XS",32);
        Phone telefon4=new Phone("Iphone","X",64);
        Phone telefon5=new Phone("Iphone","5",16);
        System.out.println(telefon1);
        System.out.println(telefon2);
        System.out.println(telefon3);
        System.out.println(telefon4);
        System.out.println(telefon5);
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + ", storage=" + storage + "]";
    }

}
