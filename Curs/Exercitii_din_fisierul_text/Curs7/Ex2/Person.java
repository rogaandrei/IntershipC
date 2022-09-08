package Exercitii_din_fisierul_text.Curs7.Ex2;

public class Person {
    private String name;

    private Transmitter transmitter;

    public Person(String name){

        this.name=name;

    }

    public void setTransmitter(Transmitter t){

        this.transmitter=t;

    }

    public Transmitter getTransmitter(){

        return transmitter;

    }

    public void send(Person p1, String message){

        this.transmitter.store(new Message(this, p1, message));

    }

    public void notifyPerson(Transmitter t){

        Message m = t.retrieve(this);

        if(m==null)

            System.out.println("Something wrong happend");

        else

            System.out.println(m);

    }

    public String toString(){

        return this.name;

    }

}

