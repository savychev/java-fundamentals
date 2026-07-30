package be.intecbrussel.oefening1.oefening1;

/**
 * Subklasse: overschrijft makeSound() maar roept eerst
 * de superversie aan om het gedrag uit te breiden.
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name); // Animal heeft geen no-args constructor, dus dit is verplicht
    }

    @Override
    public void makeSound() {
        super.makeSound(); // eerst het algemene gedrag van Animal
        System.out.println("The cat " + getName() + " says: Meow!");
    }
}
