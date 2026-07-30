package be.intecbrussel.oefening1.oefening1;

/**
 * Oefening: superklasse voor alle dieren.
 * Dog, Cat en Cow erven de naam en overschrijven makeSound().
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Animal is making sound.");
    }
}
