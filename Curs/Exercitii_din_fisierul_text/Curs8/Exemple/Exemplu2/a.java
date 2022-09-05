package Exercitii_din_fisierul_text.Curs8.Exemple.Exemplu2;

class MyException extends Exception {
    private static int instanceNo = 0;
    //acest constructor se apeleaza la fiecare instantiere a clasei,
//precum si a eventualelor subclase
    public MyException(String message) {
        super(message);
        instanceNo++;
    }
    public static int getInstanceNo() {
        return instanceNo;
    }
    public static void main(String[] argv) {
        MyException e;
//serviciile ce se doresc a fi apelate sunt
//mostenite de la clasa Exception
//getMessage(), toString(), printStackTrace(), ...
//se poate apela si getInstanceNo(), dar aceasta fiind statica
//nu se recomanda apelul prin intermediul referintei unui obiect
        e = new MyException("primul caz");
        System.out.println(e.getMessage());
        System.out.println(e.getInstanceNo());
        e = new MyException("al doilea caz");
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e = new MyException("al treilea caz");
        e.printStackTrace();
        System.out.println(e.toString());
    }
}