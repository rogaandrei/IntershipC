package Compozitie.Exercitii2;

public class Human {
    String name;
    Heart heart;
    Stomach stomach;
    Brain brain;

    public Human(String name, Heart heart, Stomach stomach, Brain brain) {
        this.name = name;
        this.heart = heart;
        this.stomach = stomach;
        this.brain = brain;
    }

    public static void main(String[] args) {
       // Brain creier=new Brain(70);
      //  Stomach stomac=new Stomach(true);
       // Heart inima=new Heart();
        Human om=new Human("Gabriela",new Heart(),new Stomach(),new Brain());
        System.out.println(om);
        om.eat();
        om.live();
        om.read();
        om.read();
        System.out.println(om);
    }
    public void eat(){
if(stomach.needsFood){
    System.out.println("Persoana mananca");
}else{
    System.out.println("Persoanei nu ii este foame");
}
    }
    public void read(){
    brain.iq++;
    }
    public void live(){
heart.beat();

}


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", heart=" + heart +
                ", stomach=" + stomach +
                ", brain=" + brain +
                '}';
    }
}
