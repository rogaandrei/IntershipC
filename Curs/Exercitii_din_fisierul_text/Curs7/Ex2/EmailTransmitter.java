package Exercitii_din_fisierul_text.Curs7.Ex2;

public class EmailTransmitter implements Transmitter{
    private Message message;

    public EmailTransmitter(){

    }

    public void store(Message message){

        this.message=message;

        message.getRecevier().notifyPerson(this);

    }

    public Message retrieve(Person receiver){

        return message;

    }

    public String toString(){

        return "EMAIL";

    }

}

