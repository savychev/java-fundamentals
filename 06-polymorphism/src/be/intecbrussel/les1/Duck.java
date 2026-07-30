package be.intecbrussel.les1;

/**
 * Eend: overschrijft animalSound() met eigen geluid.
 */
public class Duck extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Kwak");
    }
}
