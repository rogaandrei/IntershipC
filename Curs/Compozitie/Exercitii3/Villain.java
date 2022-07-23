package Compozitie.Exercitii3;

public class Villain {
    String name;
    int health;
    int attack;
   Hero enemy;

    public Villain(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;

    }

    public static void main(String[] args) {
        Villain dusman=new Villain("Joker",100,20);
        Hero eroul=new Hero("Batman",100,32);
    eroul.setRival(dusman);
    dusman.setRival(eroul);
    eroul.Attack();
    dusman.Attack();
        System.out.println(eroul);
        System.out.println(dusman);

    }

    public void Attack(){
        if(enemy!=null){
        enemy.health-= this.attack;
        System.out.println("Am atacat inamicul"+enemy);
    }else{
            System.out.println("nu avem inamici");
        }}
    public void setRival(Hero hero){
        this.enemy=hero;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }
}//nu am adaugat enemy in to string deoarece intre intr-o bucla infinita
