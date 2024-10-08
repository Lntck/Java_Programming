package week_07.Calculator;

import java.util.Scanner;

public class Main_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        char operation = scanner.next().charAt(0);
        double y = scanner.nextDouble();
        Calculator calculator = new Calculator(x, operation, y);
        switch (operation) {
            case '+':
                System.out.println(calculator.Addition(x, y));
                break;
            case '-':
                System.out.println(calculator.Subtraction(x, y));
                break;
            case '*':
                System.out.println(calculator.Multiplication(x, y));
                break;
            case '/':
                System.out.println(calculator.Division(x, y));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}