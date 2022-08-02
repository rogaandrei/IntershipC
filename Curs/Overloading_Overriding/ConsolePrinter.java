package Overloading_Overriding;

public class ConsolePrinter {
    public static void PrintText(String text) {
        System.out.println( text);

    }

    public static void PrintText(String text, int numarRepetitii) {
        for(int i=0;i<numarRepetitii;i++){
            System.out.println( text );

        }


    }

    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        printer.PrintText("salut");
        printer.PrintText("salut",4);
    }
}
