package metodestatice;

public class Player {
    static int slots=0;
    String name;
    int health;
    //static int maxSlots;
    //static int pSlots;
    public Player(String name, int health) {
        super();
        slots+=50;
        this.name = name;
        this.health = health;
        //maxSlots = 300;
        //pSlots = 50;
        if(slots>=300) {
            System.out.println("am depasit nr de jucatori");
        }

    }

    public static void main(String[] args) {
        Player p1=new Player("Eugen",100);
        Player p2=new Player("Elena",80);
        Player p3=new Player("Euclid",23);
        Player p4=new Player("Eugen",100);
        Player p5=new Player("Elena",80);
        Player p6=new Player("Euclid",23);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
//		Player.nrMax();
    }
//public static void nrMax() {
//	if(pSlots==maxSlots) {
//		System.out.println("Jocul are capacitatea maxima de jucatori");
//	}else {
//		System.out.println("Avem nevoie de jucatori");
//	}
//}



    @Override
    public String toString() {
        return "Player [name=" + name + ", health=" + health + ", slots=" + slots + "]";
    }

}