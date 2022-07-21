package Clase;

//Metoda Mea
//package Exer;
//
//public class Bus {
//String brand;
//int maxPasagers;
//int passagersNumbers;
//int maxSpeed;
//
//	public Bus(String brand, int passagersNumbers) {
//	super();
//	this.brand = brand;
//	maxPasagers = 60;
//	this.passagersNumbers = passagersNumbers;
//	maxSpeed = 10;
//}
//	public static void main(String[] args) {
//	Bus autobus1=new Bus("Mercedes",40);
//	Bus autobus2=new Bus("Ford",20);
//	autobus1.addPassager();
//	autobus1.reachNextStation();
//	autobus2.addPassager();
//	autobus2.reachNextStation();
//
//	}
//public void addPassager() {
//	if(passagersNumbers>60) {
//		System.out.println("Autobusul este plin");
//	}
//}
//public void reachNextStation() {
//	if(passagersNumbers>30) {
//		System.out.println("Autobosul va merge la statia urmatorare cu jumatate din viteza");
//		maxSpeed--;
//	}else {
//		System.out.println("Autobusul va merge la statia urmatoare cu viteza maxima");
//	}
//}
//}


public class Bus {
    String brand;
    int maxPassagers;
    int passagersNumbers;
    int maxSpeed;

    public Bus(String brand, int maxPassagers,int maxSpeed) {
        super();
        this.brand = brand;
        this.maxPassagers=maxPassagers ;

        this.maxSpeed = maxSpeed;
    }
    public static void main(String[] args) {
        Bus autobus1=new Bus("Mercedes",60,10);
        Bus autobus2=new Bus("Ford",16,10);
//	autobus1.addPassager();
//
//	autobus2.addPassager();
//	autobus2.addPassager();
//	autobus2.addPassager();
//	autobus2.addPassager();
//
        for(int i=0;i<40;i++) {
            autobus1.addPassager();
        }autobus1.reachNextStation();
        for(int i=0;i<4;i++) {
            autobus2.addPassager();
        }autobus2.reachNextStation();
    }
    public void addPassager() {
        if(passagersNumbers==maxPassagers) {
            System.out.println("Autobusul este plin");
        }else {
            System.out.println("Am adaugat alt pasager");
            passagersNumbers++;
        }
    }
    public void reachNextStation() {
        if(passagersNumbers<maxPassagers/2) {
            System.out.println("Autobusul va merge la statia urmatoare cu viteza maxima,adica cu "+maxSpeed);

        }else {
            System.out.println("Autobosul va merge la statia urmatorare cu jumatate din viteza,adica cu "+(maxSpeed/2));
        }
    }
}