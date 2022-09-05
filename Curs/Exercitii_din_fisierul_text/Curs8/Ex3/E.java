package Exercitii_din_fisierul_text.Curs8.Ex3;

class E1 extends RuntimeException{

    public E1(){

        System.out.println("Prins");

    }

}

class E2 extends RuntimeException{

    public E2(){

        System.out.println("Nu l-am prins");

    }

}

class Exemplu {

    public void doSomething(int i) {

        if(i == 0) throw new E1();

        else throw new E2();

    }

}



