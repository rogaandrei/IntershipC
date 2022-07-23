package Compozitie.Exercitii2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Trainer {
    String name;
    ArrayList<Pokemon>pokemons=new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Trainer trener=new Trainer("Ash");
        trener.addPokemonsToCollection(new Pokemon("Picachu"));
        trener.releaseAllPokemons();
    }
    public void addPokemonsToCollection(Pokemon pokemon){
    this.pokemons.add(pokemon);

    }
    public void releaseAllPokemons(){
for(Pokemon pokemon:pokemons){
    pokemon.sayHello();
}

    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                '}';
    }
}
