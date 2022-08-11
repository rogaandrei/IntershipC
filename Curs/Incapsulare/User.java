package Incapsulare;

import java.util.ArrayList;

public class User {
    private String password;
    private String username;
    private ArrayList<String> productsInCart;

    public User ( String password, String username ) {

        verificaUsername(username);
        verificareParola(password);
        productsInCart = new ArrayList<>();
    }

    public ArrayList<String> getProductsInCart () {
        return productsInCart;
    }


    public String getPassword () {
        return password;
    }

    public String getUsername () {
        return username;
    }

    public void setPassword ( String password ) {
        verificareParola(password);
    }

    public void setUsername ( String username ) {
        verificaUsername(username);
    }

    public void verificaUsername ( String username ) {
        if (username.length() >= 5) {
            this.username = username;
        } else {
            System.out.println("Parola trebuie sa fie mai mare ca 5 caractere");
        }
    }

    private void verificareParola ( String password ) {
        boolean passRequirements = true;
        char[] litereparola = password.toCharArray();
        int numarCifre = 0;
        for (char c : litereparola) {
            if (Character.isDigit(c)) {
                numarCifre++;
            }

        }
        if (numarCifre < 2) {
            System.out.println("Numarul de cifre mai mic decat 2");
            passRequirements = false;//pentru a face verificare dubla
        }
        if (password.length() < 5) {
            System.out.println("Parola trebuie sa contina minim 5 caractere");
            passRequirements = false;
        }
        if (passRequirements) {
            this.password = password;

        }
    }

    public void addProductInCart ( String newProduct ) {
        productsInCart.add(newProduct);

    }

    public void removeProductInCart ( String Product ) {
        productsInCart.remove(Product);

    }

    @Override
    public String toString () {
        return "User{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", productsInCart=" + productsInCart +
                '}';
    }
}
