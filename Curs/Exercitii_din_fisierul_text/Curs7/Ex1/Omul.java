package Exercitii_din_fisierul_text.Curs7.Ex1;

import org.w3c.dom.ls.LSOutput;

public class Omul implements Actiuni{
    @Override
    public void eat () {
        System.out.println("Omul mananca");
    }

    @Override
    public void sleep () {
        System.out.println("Omul doarme");
    }

    @Override
    public void fly () {
        System.out.println("Omul zboara");//nu va fi compatibila
    }
}
