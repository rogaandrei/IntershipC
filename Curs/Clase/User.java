package Clase;

public class User {
    String username;
    String password;
    public User(String username, String password,String confirmPasword) {
        super();
        this.username = username;
        this.password = password;
        confirmPasword=confirmPasword;
        userverificare(username);
        parolaverificare(password);

        verificcifre(password);
        confirmparola(password, confirmPasword);





    }
    private void confirmparola(String password, String confirmPasword) {
        if (!password.equals(confirmPasword)) {
            System.out.println("Parola nu corespunde");
        }//else {
//			System.out.println("Parola este corecta");
//		}
    }
    private void verificcifre(String password) {
        char[] cifre=password.toCharArray();
        int numarCifre=0;
        for(char c:cifre) {
            if(Character.isDigit(c)){
                numarCifre++;
            }
            if(numarCifre<2) {
                System.out.println("numarul de cifre este mai mic decat 2");
            }//else{
//				System.out.println("Parola contine mai mult de 2 cifre");
//			}

        }
    }
    private void parolaverificare(String password) {
        if(password.length()<8) {
            System.out.println("Parola trebuie sa fie de minim 8 caractere");
        }
    }
    private void userverificare(String username) {
        if (username.length()<7) {
            System.out.println("Parola trebuie sa fie de minim 7 caractere");//putem extrage metoda din constructor cu ajutorul la click dreapta refactor
        }
    }
    public static void main(String[] args) {
        //User user1=new User("Alfonso","2012trebuie","2012trebuie");
        User user2=new User("Miguel","123alooooo","123alooooo");

    }

}
