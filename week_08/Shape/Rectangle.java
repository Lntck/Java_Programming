package week_08.Shape;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * width + 2 * height;
    }
}
