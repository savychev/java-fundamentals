package be.intecbrussel.Animal;

/**
 * Demo bij Animal: objecten aanmaken via beide constructors en de
 * overloaded eating()-methodes uitproberen.
 */
public class AnimalApp {
    public static void main(String[] args) {
        // no-arg constructor + setters (velden zijn private!)
        Animal cat = new Animal();
        cat.setAge(1);
        cat.setName("Dimitri");
        System.out.println(cat); // roept impliciet toString() aan
        cat.eating();
        cat.eating("meat");

        // constructor met argumenten
        Animal dog = new Animal("Beethoven", 6);
        System.out.println(dog);
        dog.eating();
        dog.eating("apple");

        // leeftijd 0: het dier mag nog niet eten
        Animal cat1 = new Animal("Salvador", 0);
        System.out.println(cat1);
        cat1.eating();
        cat1.eating("chips");
    }
}
