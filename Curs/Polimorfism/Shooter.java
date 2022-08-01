package Polimorfism;

public class Shooter {
    int maxRange;

    public Shooter(int maxRange) {
        this.maxRange = maxRange;
    }

    public void shoot(){
        System.out.println("A impuscat");
    }

    public static void main(String[] args) {
        Sniper sniper=new Sniper();
        Pistol pistol=new Pistol();
        AK47 ak47=new AK47();
        sniper.shoot();
        pistol.shoot();
        ak47.shoot();
    }
}
