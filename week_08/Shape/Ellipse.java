package week_08.Shape;

public class Ellipse extends Shape {
    private double semi_axe_a;
    private double semi_axe_b;

    public Ellipse(double semi_axe_a, double semi_axe_b) {
        this.semi_axe_a = semi_axe_a;
        this.semi_axe_b = semi_axe_b;
    }

    @Override
    protected double calculateArea() {
        return semi_axe_b * semi_axe_a * Math.PI;
    }

    @Override
    protected double calculatePerimeter() {
        return 4 * ((Math.PI * semi_axe_b * semi_axe_a) + (semi_axe_a - semi_axe_b))/(semi_axe_a+semi_axe_b);
    }
}
