package be.intecbrussel.les1;

/**
 * Kat: overschrijft animalSound() met eigen geluid.
 */
public class Cat extends Animal {
    @Override // overriding: zelfde signatuur, ander gedrag
    public void animalSound() {
        System.out.println("Meow");
    }
}
