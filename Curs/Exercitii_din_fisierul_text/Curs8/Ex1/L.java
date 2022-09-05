package Exercitii_din_fisierul_text.Curs8.Ex1;

class L1 extends Exception {
    public String toString () {
        return "L1";
    }
}

class L2 extends Exception {
    public String toString () {
        return "L2";
    }
}

class Test {
    public static void main ( String argv[] ) {
        try {
            int i;
            for (i = 0; i < 4; i++) {
                if (i == 0) throw new L1();
                else throw new L2();
            }
        } catch (L1 e) {
            System.out.println(e);
        } catch (L2 e) {
            System.out.println(e);
        }
    }//arunca L1 deoarece daca numarul e mai mic decat 4 (in cazul nostru e 0)atunci sa se afiseze L1
}