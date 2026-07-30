package be.intecbrussel.OpdrachtWolf;

/**
 * Wilde hond: kan jagen en meerdere keren blaffen.
 */
public class WildDog extends Dog {

    public WildDog(String name, int lifespan, char size) {
        super(name, lifespan, size);
    }

    // Overloading: bark(int) bestaat naast bark() uit de superklasse Dog
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(" wow");
        }
    }

    public void hunt() {
        System.out.println(getName() + " is hunting.");
    }
}
