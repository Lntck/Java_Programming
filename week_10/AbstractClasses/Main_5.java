package week_10.AbstractClasses;
import java.util.Objects;

abstract class Creature {
    abstract void bear();
    abstract void die();
    String name = null;
    boolean isAlive = false;

    void shoutName(){
        System.out.println(Objects.requireNonNullElse(name, "error message\n"));
    }
}

class Human extends Creature {
    @Override
    void bear() {
        System.out.printf("The %s %s was born\n", "Human", name);
    }

    @Override
    void die() {
        System.out.printf("The %s %s has died\n", "Human", name);
    }
}


class Alien extends Creature {
    @Override
    void bear() {
        System.out.printf("The %s %s was born\n", "Alien", name);
    }

    @Override
    void die() {
        System.out.printf("The %s %s has died\n", "Alien", name);
    }
}


class Dog extends Creature {
    @Override
    void bear() {
        System.out.printf("The %s %s was born\n", "Dog", name);
    }

    @Override
    void die() {
        System.out.printf("The %s %s has died\n", "Dog", name);
    }

    void bark(){
        System.out.printf("The %s %s was bark\n", "Dog", name);
    }
}


public class Main_5 {
    public static void main(String[] args) {
        Creature[] creatures = addCreature();
        for (Creature creature : creatures) {
            creature.bear();
            creature.die();
        }
    }

    public static Creature[] addCreature() {
        Creature[] creatures = new Creature[3];
        Creature c1 = new Human();
        c1.name = "John";
        Creature c2 = new Alien();
        c2.name = "Bob";
        Creature c3 = new Dog();
        c3.name = "Peach";
        ((Dog)c3).bark();
        creatures[0] = c1;
        creatures[1] = c2;
        creatures[2] = c3;
        return creatures;
    }
}
