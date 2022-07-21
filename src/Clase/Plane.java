package Clase;


    public class Plane {
        String brand;
        String model;
        boolean isFlying;
        int maxPassagers;
        int numberOfPassagers;

        public Plane(String brand, String model, int maxPassagers) {
            super();
            this.brand = brand;
            this.model = model;
            this.maxPassagers = maxPassagers;
        }
        public static void main(String[] args) {
            Plane avion=new Plane("Airlanes","FlyEmirates",100);
            avion.land();
            for(int i=0;i<100;i++) {
                avion.addPassagers();
            }
            avion.fly();
            avion.land();
        }
        public void addPassagers() {
            if(numberOfPassagers<maxPassagers) {
                System.out.println("Un pasager a urcat");
                numberOfPassagers++;
            }else {
                System.out.println("Avionul este la capacitate maxima");
            }}
        public void fly() {
            if(isFlying||numberOfPassagers<(maxPassagers/2))//facem verifcare dubla
            {

                System.out.println("Avionul nu va decola");

            }else {
                System.out.println("Avionul  va decola");
                isFlying=true;
            }
        }
        public void land() {
            if(isFlying) {
                System.out.println("Putem ateriza");
                isFlying=false;
            }else {
                System.out.println("Suntem la sol");
            }
        }
    }


