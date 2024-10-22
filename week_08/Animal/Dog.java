package week_08.Animal;

public class Dog extends Animal{
    public Dog(String name, int height, int weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog Eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleep...");
    }

    @Override
    public void makeSound() {
        System.out.println("GAF.....");
    }
}
