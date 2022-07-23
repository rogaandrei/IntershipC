package Compozitie.Exercitii3;

public class Hero {
    String name;
    int health;
    int attack;
    Villain enemy;

    public Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;

    }

    public void Attack(){

            if(enemy!=null){
                enemy.health-= this.attack;
                System.out.println("Am atacat inamicul"+enemy);
            }else{
                System.out.println("nu avem inamici");
            }}

    public void setRival(Villain villain){
    this.enemy=villain;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +

                '}';
    }
}
