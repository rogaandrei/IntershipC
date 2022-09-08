package Exercitii_din_fisierul_text.Curs7.Ex2;

public class Main {
    public static void main(String[] args) {

        Person p1=new Person("Paul");

        Person p2=new Person("Andreea");

        Person p3=new Person("Ioana");

        Person p4=new Person("Gabriel");

        Transmitter email=new EmailTransmitter();  //cream sistemul de transmitere prin e-mail-uri

        Transmitter mail=new MailTransmitter(2);   //cream sistemul de transmitere prin scrisori, cu un buffer de 2 scrisori

        p1.setTransmitter(email);  //p1 doreste sa trimita un e-mail catre p2

        p1.send(p2,"Scrie-i Ioanei sa-mi dea adresa ei de e-mail!"); /*p2 trimite o scrisoare catre p3. Scrisoarea nu va ajunge imediat,

                                                                     deoarece deocamdata este singura in "cutia postala"*/

        p2.setTransmitter(mail);

        p2.send(p3,"Paul zice sa-i trimiti adresa ta de e-mail");

        p4.setTransmitter(mail);      //p4 trimite o scrisoare catre p1. Fiind a doua scrisoare,

        p4.send(p1,"Ce mai faci?");   //buffer-ul de scrisori se va umple si ambele scrisori vor fi trimise

        //p3 a primit in acest moment scrisoarea de la p2 si poate raspunde

        //prin e-mail lui p1

        p3.setTransmitter(email);

        p3.send(p1,"Adresa mea de e-mail este: ioana@yahoo.com");

    }

}

