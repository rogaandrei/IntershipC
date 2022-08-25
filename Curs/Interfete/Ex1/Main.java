package Interfete.Ex1;

public class Main {
    public static void main ( String[] args ) {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(10);
        Square square = new Square(12);
        int numarLaturiTriunghi = getTotalSides(equilateralTriangle);
        int numarLaturiPatrat = getTotalSides(square);
        System.out.println("Triunghiul echilateral are: " + numarLaturiTriunghi + " laturi");
        System.out.println("Triunghiul echilateral are: " + numarLaturiPatrat + " laturi");
        int perimetruTriunghi=getPerimeter(equilateralTriangle);
        int perimetruPatrat=getPerimeter(square);
        System.out.println("Perimetrul triunghiului echilateral este: " + perimetruTriunghi );
        System.out.println("Perimetrul patratului este: " + perimetruPatrat );
    }

    public static int getTotalSides ( RegularPolygon regularPolygon ) {
        return regularPolygon.getNumSides();
    }

    public static int getPerimeter ( RegularPolygon regularPolygon ) {
        return regularPolygon.getNumSides() * regularPolygon.getSideLength();

    }
}
