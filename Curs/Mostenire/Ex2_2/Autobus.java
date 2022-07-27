package Mostenire.Ex2_2;

public class Autobus extends Automobil{
    int maxPassagers;
    int currentPassagers;

    public Autobus(int maxPassagers, int currentPassagers,String model,String marca) {
        super(model,marca);
        this.maxPassagers = maxPassagers;
        this.currentPassagers = 0;
    }

    public void addPassagers(){
        if(currentPassagers>=maxPassagers){
            System.out.println("Autobusul este plin");
        }else{
            currentPassagers++;
            System.out.println("A urcat un pasager");

        }
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "maxPassagers=" + maxPassagers +
                ", currentPassagers=" + currentPassagers +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", started=" + started +
                '}';
    }
}
