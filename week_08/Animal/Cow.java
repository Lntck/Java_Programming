package week_08.Animal;

public class Cow extends Animal{
    public Cow(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void eat() {
        System.out.println("Cow Eats grass");
    }

    @Override
    public void sleep() {
        System.out.println("Cow Sleep...");
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuuuuuuuuuuuuuu...");
    }
}
