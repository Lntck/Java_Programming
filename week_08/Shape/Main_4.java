package week_08.Shape;

public class Main_4 {
    public static void main(String[] args) {
        Shape[] shapes = addShapes();
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }
    }

    public static Shape[] addShapes() {
        Shape[] shapes = new Shape[5];
        Shape kvadrat = new Square(5);
        shapes[0] = kvadrat;
        Shape krug = new Circle(10);
        shapes[1] = krug;
        Shape pryamougolnik = new Rectangle(25, 30);
        shapes[2] = pryamougolnik;
        Shape treugolnik = new Triangle(3, 4, 5);
        shapes[3] = treugolnik;
        Shape oval = new Ellipse(12, 6);
        shapes[4] = oval;
        return shapes;
    }
}
