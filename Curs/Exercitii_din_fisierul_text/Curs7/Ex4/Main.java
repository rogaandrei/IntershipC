package Exercitii_din_fisierul_text.Curs7.Ex4;

import java.util.ArrayList;

public class Main {
    public static void main ( String[] args ) {
        Project project=new Project("Proiect","Performanta",new ArrayList<>(2000));
        Militare militare=new Militare("Proiect1","Locul1",new ArrayList<>(3000),"o luna",15,"abcd");
        OpenSource openSource=new OpenSource("Proiect2","Recunoastere internationala",new ArrayList<>(3000),"ertyjhgfd@gmail.com",15);
        Member member1=new Member(20,"Ion");
        militare.addMember(member1);
        militare.getRisk();
        project.calcFonduri();
    }
}
