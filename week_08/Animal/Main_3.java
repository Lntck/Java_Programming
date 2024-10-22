package week_08.Animal;

public class Main_3 {
    public static void main(String[] args) {

        Dog Kuzya = new Dog("Kuzya", 50, 5, "brown");
        Kuzya.makeSound();
        Kuzya.eat();
        Kuzya.sleep();

        Cat Peach = new Cat("Peach", 50, 5, "orange");
        Peach.makeSound();
        Peach.eat();
        Peach.sleep();

        Cow Galya = new Cow("Galya", 170, 90, "red");
        Galya.makeSound();
        Galya.eat();
        Galya.sleep();

        System.out.printf("________________\n");
        Animal[] animals = addAnimals();
        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
            animal.sleep();
        }
    }

    public static Animal[] addAnimals() {
        Animal[] animals = new Animal[4];
        Animal animal = new Animal("unknown", 22, 60, "purple");
        animals[0] = animal;
        Animal dog = new Dog("doggie", 50, 5, "brown");
        animals[1] = dog;
        Animal cat = new Cat("cat", 50, 5, "orange");
        animals[2] = cat;
        Animal cow = new Cow("cow", 170, 90, "red");
        animals[3] = cow;
        return animals;
    }
}
