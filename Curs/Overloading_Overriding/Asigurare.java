package Overloading_Overriding;

public class Asigurare {
    String id;
static int cursor=1;
    public Asigurare() {
        this.id = String.valueOf(cursor++);
    }

    @Override
    public String toString() {
        return "Asigurare{" +
                "id='" + id + '\'' +
                '}';
    }
}
