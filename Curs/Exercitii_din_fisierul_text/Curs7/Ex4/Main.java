package Exercitii_din_fisierul_text.Curs7.Ex4;

public class Main {
    public static void main ( String[] args ) {
        Project project=new Project("Proiect","Performanta",30000);
        Militare militare=new Militare("Proiect1","Locul1",20000,"o luna",15,"abcd");
        Member member1=new Member(20,"Ion");
        militare.addMember(member1);
        militare.getRisk();
    }
}
