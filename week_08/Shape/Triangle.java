package week_08.Shape;

public class Triangle extends Shape{
    double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    protected double calculateArea() {
        double p = this.calculatePerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
