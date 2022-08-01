package Polimorfism;

public class AK47 extends Shooter{
    public AK47() {
        super(500);
    }
    public void multiShoot(){
        System.out.println("A impuscat cu mai multe gloante");
    }

    @Override
    public void shoot() {
        //super.shoot();
        multiShoot();
    }
}
