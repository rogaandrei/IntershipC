package Exercitii_din_fisierul_text.Curs2;

public class Ex3 {
    class Motor {
        private int capacitate;
        public Motor(int c) {
            capacitate = c;
        }
        public void setCapacitate(int c) {
            capacitate = c;
        }
        public void tipareste() {
            System.out.println("Motor de capacitate " + capacitate);
        }

        public void main(String[] args) //metoda ii nestatica
        {// Motor motor=new Motor(1);
            Motor m1, m2;
            m1 = new Motor(5);
            m2 = m1;
            m2.setCapacitate(10);
            m1.tipareste();
        }
    }
}
