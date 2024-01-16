package Seminar6.srp1;

import Seminar6.srp1.figure.Point;
import Seminar6.srp1.figure.Square;
import Seminar6.srp1.figure.SquarePainter;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        SquarePainter squarePainter = new SquarePainter();
        squarePainter.draw(square);
    }
}