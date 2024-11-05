package week_11.Enums;

public enum Drinks {
    Coke("Coke-cola", 9),
    Fanta("Fanta", 5),
    Sprite("Sprite", 2);
    private final int price;
    private final String name;
    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " -> " + this.price + "$";
    }
}