package week_11.Enums;


public class VendingMachine {
    private State currentState;
    private Drinks selectedDrink;
    private int Moneys;

    public VendingMachine() {
        currentState = State.IDLE;
        Moneys = 0;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void handleEvent(Event event) {
        switch (currentState) {
            case IDLE:
                if (event == Event.SELECT_PRODUCT) {
                    currentState = State.SELECTING;
                } else {
                    System.out.println("Invalid action in IDLE state.");
                }
                break;

            case SELECTING:
                if (event == Event.CANCEL) {
                    System.out.println("Transaction canceled. Returning to idle.");
                    resetTransaction();
                } else {
                    System.out.println("Invalid action in SELECT_PRODUCT state.");
                }
                break;

            case PAYMENT:
                if (event == Event.PAYMENT) {
                    if (Moneys >= selectedDrink.getPrice()) {
                        System.out.println("Payment successful. Dispensing now...");
                        currentState = State.DISPENSING;
                        handleEvent(Event.DISPENSE);
                    } else {
                        System.out.println("Not enough money inserted. Insert more coins.");
                    }
                } else if (event == Event.CANCEL) {
                    System.out.println("Transaction canceled. Returning to idle.");
                    resetTransaction();
                } else {
                    System.out.println("Invalid action in PAYMENT state.");
                }
                break;

            case DISPENSING:
                if (event == Event.DISPENSE) {
                    System.out.println("Dispensing " + selectedDrink.getName() + ". Enjoy your drink!");
                    System.out.println("Your change: " + (Moneys - selectedDrink.getPrice()) + "$");
                    resetTransaction();
                } else {
                    System.out.println("Invalid action in DISPENSING state.");
                }
                break;

            default:
                throw new IllegalStateException("Unexpected state: " + currentState);
        }
    }

    public void selectDrink(int drinkChoice) {
        if (currentState == State.SELECTING) {
            if (drinkChoice > 0 && drinkChoice <= Drinks.values().length) {
                selectedDrink = Drinks.values()[drinkChoice - 1];
                System.out.println("You selected: " + selectedDrink.getName() + ". Price: $" + selectedDrink.getPrice());
                currentState = State.PAYMENT;
            } else {
                System.out.println("Invalid selection. Try again.");
            }
        } else {
            System.out.println("Please start a transaction first.");
        }
    }

    public void insertBanknote(int denomination) {
        if (currentState == State.PAYMENT) {
            Money banknote = getMoneyByDenomination(denomination);
            if (banknote != null) {
                Moneys += banknote.getDenomination();
                System.out.println("Inserted $" + banknote.getDenomination() + ". Total inserted: $" + Moneys);
            } else {
                System.out.println("Invalid banknote denomination: " + denomination);
            }
        } else {
            System.out.println("Please select a product first.");
        }
    }

    private void resetTransaction() {
        selectedDrink = null;
        Moneys = 0;
        currentState = State.IDLE;
    }

    public void displayDrinks() {
        System.out.println("Available Drinks:");
        for (Drinks drink : Drinks.values()) {
            System.out.println((drink.ordinal() + 1) + ") " + drink);
        }
    }

    private Money getMoneyByDenomination(int denomination) {
        for (Money money : Money.values()) {
            if (money.getDenomination() == denomination) {
                return money;
            }
        }
        return null;
    }

    public Drinks getSelectedDrink() {
        return selectedDrink;
    }

    public int getMoneys() {
        return Moneys;
    }
}
