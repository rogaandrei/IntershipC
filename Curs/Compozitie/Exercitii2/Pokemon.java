package Compozitie.Exercitii2;

public class Pokemon {
    String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name+ " " +name+ " " +name);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                '}';
    }
}
