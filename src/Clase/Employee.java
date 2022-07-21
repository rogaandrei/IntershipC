package Clase;

public class Employee {
    String nume;
    int an;
    String adresa;
    int salariu;


    public Employee(String nume, int an, String adresa, int salariu) {

        this.nume = nume;
        this.an = an;
        this.adresa = adresa;
        this.salariu = salariu;

    }
    public static void main(String[] args) {
        Employee angajat1 =new Employee("ion",2000,"g.urschi",2000);
        Employee angajat2 =new Employee("bion",2001,"g.ursch",2009);
        Employee angajat3 =new Employee("dion",2100,"g.uschi",2500);
        angajat1.show();
        angajat2.show();
        angajat3.show();
    }
    public void show() {
        System.out.println(nume+ "" +an+ "" +adresa+ ""+salariu+"");
    }
}
