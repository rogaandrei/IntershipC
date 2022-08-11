package Incapsulare;

public class Aplicatie {
    public static void main ( String[] args ) {
        User user = new User("21asdfg", "asdfgh");
//        System.out.println(user);
//        user.setPassword("12rr");
//        System.out.println(user);

        user.addProductInCart("Mar");
        user.addProductInCart("Par");
        user.removeProductInCart("Mar");
        System.out.println(user.getProductsInCart());
    }

}
