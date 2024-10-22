package week_08.Animal;

public class Animal {
    private String name;
    private int height;
    private int weight;
    private String color;
    public Animal(String name, int height, int weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void eat(){};
    public void sleep(){};
    public void makeSound(){};

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
