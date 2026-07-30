package be.intecbrussel.oefening1.oefening1;

/**
 * Subklasse: eigen geluid via overriding, naam komt uit Animal.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name); // naam doorgeven aan de superklasse
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The dog " + getName() + " says: Woof!");
    }
}
