package week_08.Animal;

public class Cat extends Animal{
    public Cat(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat Eats sausage");
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleep...");
    }

    @Override
    public void makeSound() {
        System.out.println("Myyyyyyaaaaaauuuuu...");
    }
}
