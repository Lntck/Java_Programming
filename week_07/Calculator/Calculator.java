package week_07.Calculator;

public class Calculator {
    double x;
    double y;
    char operation;

    public Calculator(double x, char operation, double y) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    double Addition(double x, double y) {
        return x + y;
    }

    double Subtraction(double x, double y) {
        return x - y;
    }

    double Multiplication(double x, double y) {
        return x * y;
    }

    double Division(double x, double y) {
        if (y == 0) return -1;
        return x / y;
    }
}