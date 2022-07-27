package Mostenire.Ex3;

import java.util.ArrayList;

public class Client {
    String name;
    int buget;
    ArrayList<Haine> produseCumparate;

    public Client(String name, int buget) {
        this.name = name;
        this.buget = buget;
        this.produseCumparate =new ArrayList<>();

    }
    public void buy(Haine haine){
        if(this.buget>=haine.pret){
            System.out.println("Clientul " +name+ " a cumparat haina "+haine);
            this.produseCumparate.add(haine);this.buget-= haine.pret;
        }else{
            System.out.println("Clientul " +name+ " Nu are bani suficienti pentru a cumpara haina: " +haine);
        }


    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", buget=" + buget +
                ", produseCumparate=" + produseCumparate +
                '}';
    }
}
