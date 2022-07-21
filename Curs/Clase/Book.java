package Clase;

public class Book {
    String name;
    String author;
    int totalPageNumber;
    int currentPageNumber;

    public Book(String name, String author, int totalPageNumber, int currentPageNumber) {
        super();
        this.name = name;
        this.author = author;
        this.totalPageNumber = totalPageNumber;
        currentPageNumber = 1;
    }
    public static void main(String[] args) {
        Book carte=new Book("paradisul Piratilor","Emil Cucereanu",200,1);
        Book carte2=new Book("ASDF","asd",300,1);
        Book carte3=new Book("AS2","arf",100,1);
        AllPages(carte);
        AllPages(carte2);
        AllPages(carte3);

//	carte.FlipPageForward();
//	carte.PrintBookState();
//	carte.FlipPageForward();
//	carte.FlipPageForward();
//	carte.FlipPageBackward();

    }

    public void FlipPageForward() {
        if(currentPageNumber==totalPageNumber) {
            System.out.println("Ati terminat cartea de citit!!");
        }else {
            currentPageNumber++;
            System.out.println("am dat la pagina:"+currentPageNumber);
        }
    }
    public void FlipPageBackward() {
        if(currentPageNumber==1) {
            System.out.println("Nu puteti da inapoi!!");
        }else {
            currentPageNumber--;
            System.out.println("am dat la pagina:"+currentPageNumber);
        }
    }
    public void PrintBookState() {
        System.out.println("Cartea "+name+",scrisa de "+author+" avand "+totalPageNumber+  " pagini,este deschisa la pagina "+currentPageNumber);
        System.out.println(currentPageNumber);
    }
    public static void AllPages(Book book) {
        for(int i=book.currentPageNumber;i<book.totalPageNumber;i++) {
            book.FlipPageForward();
        }book.PrintBookState();
    }
}
