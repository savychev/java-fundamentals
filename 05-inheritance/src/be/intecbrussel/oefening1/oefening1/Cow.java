package be.intecbrussel.oefening1.oefening1;

/**
 * Subklasse: eigen geluid via overriding, naam komt uit Animal.
 */
public class Cow extends Animal {
    public Cow(String name) {
        super(name); // naam doorgeven aan de superklasse
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The cow " + getName() + " says: Moo!");
    }
}
