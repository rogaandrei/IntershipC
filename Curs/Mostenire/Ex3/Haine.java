package Mostenire.Ex3;

public class Haine {
    String marca;
    int pret;

    public Haine(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public static void main(String[] args) {
        Pantaloni pantaloni=new Pantaloni("Adidas",2000,4);
        Hanorace hanorace=new Hanorace("Nike",3000,false);
        Adidasi adidasi=new Adidasi("Puma",4000,true);
        Client client=new Client("Tudor",8000);
        client.buy(adidasi);
        client.buy(hanorace);
        client.buy(pantaloni);
        System.out.println(client);
    }
    @Override
    public String toString() {
        return "Haine{" +
                "marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
