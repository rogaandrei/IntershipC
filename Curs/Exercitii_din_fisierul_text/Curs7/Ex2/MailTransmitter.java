package Exercitii_din_fisierul_text.Curs7.Ex2;

public class MailTransmitter implements Transmitter{
    private int numberMessages=0;

    private int maxMessages;

    private Message[] messages;

    public MailTransmitter(int maxMessages){

        this.maxMessages=maxMessages;

        this.messages=new Message[maxMessages];

    }

    public void store(Message message){

        if(numberMessages<maxMessages){

            this.messages[numberMessages]=message;

            numberMessages++;

        }

        if(numberMessages==maxMessages) {

            for(int i=0;i<numberMessages;i++) {

                messages[i].getRecevier().notifyPerson(this);

            }

            this.numberMessages=0;

            this.messages=new Message[maxMessages];

        }

    }

    public Message retrieve(Person receiver){

        for(int i=0;i<numberMessages;i++) {

            if (receiver == messages[i].getRecevier()) {

                return messages[i];

            }

        }

        return null;

    }

    public String toString(){

        return "MAIL";

    }

}

