package Exercitii_din_fisierul_text.Curs8.Exemple.Exemplu1;


    class ExceptieSirPlin extends Exception {
        public ExceptieSirPlin(String mesaj) {
            super(mesaj);
        }
    }
    class ExceptieNumarAbsent extends Exception {
        private double nr;
        public ExceptieNumarAbsent(double nr) {
            super("Numarul " + nr + " nu apare in sir!");
            this.nr = nr;
        }
        public int getNumarAbsent() {
            return (int) nr;
        }
    }
    class ExceptieNuExistaNumere extends Exception {
        public ExceptieNuExistaNumere() {
            super("Nu mai exista numere dupa numarul dat!");
        }
    }

