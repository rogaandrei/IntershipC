package metodestatice;

public class Book {
    static int contor=0;
    String name;
    String authorName;

    public Book(String name, String authorName) {
        super();

        this.name = name;
        this.authorName = authorName;
    }
    public static void main(String[] args) {
        Book carte1=new Book("Aventurile lui Guliver1","IDK");
        Book carte2=new Book("Aventurile lui Guliver2","IDK");
        Book carte3=new Book("Aventurile lui Guliver3","IDK");
        Book carte4=new Book("Aventurile lui Guliver4","IDK");
        Book carte5=new Book("Aventurile lui Guliver5","IDK");
        System.out.println(carte1);
        System.out.println(carte2);
        System.out.println(carte3);
        System.out.println(carte4);
        System.out.println(carte5);

        carte1.barrow();
        carte2.barrow();
        carte3.barrow();
        carte4.barrow();
        carte5.barrow();
        System.out.println("totalul nr imprumutata este de "+Book.contor);
    }
    @Override
    public String toString() {
        return "Book [name=" + name + ", authorName=" + authorName + "]";
    }
    public void barrow() {
        System.out.println("Cartea "+name+" a fost imprumutata");
        contor++;
    }
}
