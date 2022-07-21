package Clase;

public class Pencil {
    String colour;
    int remainingINK;

    public Pencil(String colour) {

        this.colour = colour;
        remainingINK = 1000;
    }
    public static void main(String[] args) {
        Pencil pix=new Pencil("verde");
        pix.write("hello my niga !!");
        System.out.println(pix.remainingINK);
    }
    public void write(String text) {
        char[] litere=text.toCharArray();
        for(char c:litere) {
            if(Character.isDigit(c)||Character.isLetter(c)) {remainingINK--;}
        }
        //remainingINK-=text.length();//se va scadea cerneala si pentru spatiile libere
        System.out.println(text);
    }
}
