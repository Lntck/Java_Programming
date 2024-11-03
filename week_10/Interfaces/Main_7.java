package week_10.Interfaces;


interface Swimmable {
    void swim();
    void stopSwimming();
}


interface Flyable {
    void fly();
    void stopFlying();
}


interface Living {
    default void live() {
        System.out.printf("%s lives\n", this.getClass().getSimpleName());
    }
}


class Submarine implements Swimmable {
    @Override
    public void swim() {
        System.out.printf("%s swimming\n", this.getClass().getSimpleName());
    }

    @Override
    public void stopSwimming() {
        System.out.printf("%s stop swimming\n", this.getClass().getSimpleName());
    }
}


class Duck implements Swimmable, Flyable, Living {
    @Override
    public void swim() {
        System.out.printf("%s swimming\n", this.getClass().getSimpleName());
    }

    @Override
    public void stopSwimming() {
        System.out.printf("%s stop swimming\n", this.getClass().getSimpleName());
    }

    @Override
    public void fly() {
        System.out.printf("%s flying\n", this.getClass().getSimpleName());
    }

    @Override
    public void stopFlying() {
        System.out.printf("%s stop flying\n", this.getClass().getSimpleName());
    }
}


class Penguin implements Swimmable, Living {
    @Override
    public void swim() {
        System.out.printf("%s swimming\n", this.getClass().getSimpleName());
    }

    @Override
    public void stopSwimming() {
        System.out.printf("%s stop swimming\n", this.getClass().getSimpleName());
    }
}

public class Main_7 {
    public static void main(String[] args) {
        Living[] livings = addLivings();
        for (Living living : livings) {
            living.live();
        }
    }

    public static Living[] addLivings() {
        Living[] livings = new Living[2];
        Living duck = new Duck();
        Living peng = new Penguin();
        livings[0] = duck;
        livings[1] = peng;
        return livings;
    }
}
