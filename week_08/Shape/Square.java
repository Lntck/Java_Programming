package week_08.Shape;

public class Square extends Shape{
    private double width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    protected double calculateArea() {
        return width * width;
    }

    @Override
    protected double calculatePerimeter() {
        return 4 * width;
    }
}
