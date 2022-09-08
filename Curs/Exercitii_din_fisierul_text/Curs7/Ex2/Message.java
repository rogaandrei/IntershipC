package Exercitii_din_fisierul_text.Curs7.Ex2;

public class Message {
    private Person sender,recevier;

    private String message;

    public Message(Person sender, Person recevier, String message){

        this.sender=sender;

        this.recevier=recevier;

        this.message=message;

    }

    public String toString(){

        String result="";

        result=result+this.sender+" said to "+this.recevier+" ("+this.sender.getTransmitter()+"):"+this.message;

        return result;

    }

    public Person getRecevier() {

        return recevier;

    }

}

