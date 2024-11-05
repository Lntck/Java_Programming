package week_11.Enums;

import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.displayDrinks();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Select product:");
            int operation = scan.nextInt();
            switch (operation) {
                case 1: case 2: case 3:
                    machine.handleEvent(Event.SELECT_PRODUCT);
                    machine.selectDrink(operation);
                    while (machine.getSelectedDrink().getPrice() > machine.getMoneys()) {
                        System.out.println("Insert banknote:");
                        machine.insertBanknote(scan.nextInt());
                    }
                    machine.handleEvent(Event.PAYMENT);
                    break;
                case 0:
                    System.out.println("VendingMachine stopped...");
                    return;
                default:
                    System.out.println("404 Product Not Found...");
                    break;
            }
        }
    }
}