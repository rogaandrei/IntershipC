package Exercitii_din_fisierul_text.Curs7.Ex2;

public interface Transmitter {
    void store(Message message);

    Message retrieve(Person receiver);

    String toString();
}
