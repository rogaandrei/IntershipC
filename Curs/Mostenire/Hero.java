package Mostenire;

public class Hero {
    String name;
    String hiddenIdentity;

    public Hero(String name, String hiddenIdentity) {
        this.name = name;
        this.hiddenIdentity = hiddenIdentity;
    }

    public void attack() {
        System.out.println(name + " a atacat ");
    }

    public static void main(String[] args) {
        Superman superman = new Superman("Superman", "Clark Kent");
        Batman batman = new Batman("Batman", "Bruce Wayne");
        Flash flash = new Flash("Flash", "Barry Allen");
        kidFlash kid = new kidFlash("KidFlash", "Wally West");
        tornadoTwins tornado = new tornadoTwins("TornadoTwins", "Don & Dawn Allen");

        superman.attack();
        superman.fly();

        batman.attack();
        batman.useGadgets();

        flash.attack();
        flash.timeTravel();
        flash.speedRun();

        kid.attack();
        kid.savePerson();
        kid.speedRun();

        tornado.attack();
        tornado.doubleRun();
        tornado.speedRun();

    }
}
