package Seminar6.lsp1;

import Seminar6.lsp1.shape.Quadrilateral;
import Seminar6.lsp1.shape.Rectangle;
import Seminar6.lsp1.shape.Square;
import Seminar6.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral q = new Rectangle(5, 4);
        Rectangle rectangle = (Rectangle) q;
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
