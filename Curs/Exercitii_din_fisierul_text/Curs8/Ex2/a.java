package Exercitii_din_fisierul_text.Curs8.Ex2;

class E1 extends RuntimeException {

}

class E2 extends RuntimeException {

    public E2 () {

        System.out.println("Nu l-am prins");

    }

}

class Exemplu {

    public void doSomething ( int i ) {

        try {

            if (i == 0) throw new E1();

            else throw new E2();

        } catch (E1 e) {

            System.out.println("Prins");

        }

    }

}


