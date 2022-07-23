package Compozitie.Exercitii3;

import java.util.ArrayList;

public class Town {
    String name;
    ArrayList<LocalAttraction>localAttractions;

    public Town(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Town oras=new Town("Paris");
        LocalAttraction atractie1=new LocalAttraction("Le Tour Eiffel",120,200);
        LocalAttraction atractie2=new LocalAttraction("Le Louvre",150,280);
        LocalAttraction atractie3=new LocalAttraction("La Seine",130,250);
        oras.addAttraction(atractie1);
        oras.addAttraction(atractie2);
        oras.addAttraction(atractie3);
        oras.displayAttractions();
    }
    public void addAttraction(LocalAttraction localAttraction){
this.localAttractions.add(localAttraction);
        //System.out.println("Am adugat o locatie noua");

    }
    public void displayAttractions(){
        for(LocalAttraction localAttraction:localAttractions){
            System.out.println(localAttraction);
        }

    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", localAttractions=" + localAttractions +
                '}';
    }
}
