package Interfete.Ex1;

import Interfete.Ex1.RegularPolygon;

public class Square implements RegularPolygon {
    int sideLength;

    public Square ( int sideLength ) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides () {
return 4;
    }

    @Override
    public int getSideLength () {
return sideLength;
    }
}
