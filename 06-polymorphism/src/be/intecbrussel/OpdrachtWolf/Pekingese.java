package be.intecbrussel.OpdrachtWolf;

public class Pekingese extends HomelyDog {
    private double hairLength;

    public Pekingese(String name, int lifespan, char size, char coat, double hairLength) {
        super(name, lifespan, size, coat);
        this.hairLength = hairLength;
    }

    public void play() {
        System.out.println(getName() + " is playing.");
    }
}
