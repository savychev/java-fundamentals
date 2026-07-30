package be.intecbrussel.OpdrachtWolf;

public class WildDog extends Dog {
    private char size = 'L';

    public WildDog(String name, int lifespan, char size) {
        super(name, lifespan, size);
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(" wow");
        }
    }

    public void hunt() {
        System.out.println(getName() + " is hunting.");
    }
}
