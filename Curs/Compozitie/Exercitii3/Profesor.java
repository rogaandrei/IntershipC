package Compozitie.Exercitii3;

import java.util.ArrayList;

public class Profesor {
    String nume;
    ArrayList<Elev>elevi=new ArrayList<>();

    public Profesor(String nume) {
        this.nume = nume;
    }

    public static void main(String[] args) {
        Profesor prof=new Profesor("Elena");
        Elev elev=new Elev("Ion");
        Elev elev1=new Elev("Ionela");
        Elev elev2=new Elev("Gheorghe");
        elev.note.add(10);
        elev.note.add(8);
        elev.note.add(5);
        elev1.note.add(9);
        elev1.note.add(9);
        elev1.note.add(9);
        elev2.note.add(2);
        elev2.note.add(6);
        elev2.note.add(7);
        prof.addStudent(elev);
        prof.addStudent(elev1);
        prof.addStudent(elev2);
        prof.calculeazaMediile();

    }

public void addStudent(Elev elev){
        elevi.add(elev);

}
    public void addGrade(int index, int grade){
elevi.get(grade).note.add(grade);
    }
    public void calculeazaMediile(){
        for(Elev elev:elevi){
            int medie=0;
            for(int nota:elev.note){
                medie+=nota;
            }medie=medie/elev.note.size();//sau medie/=elev.note.size();
             System.out.println("Media elevului este de: "+medie);
        }

    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                ", elevi=" + elevi +
                '}';
    }
}
