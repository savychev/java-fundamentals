package be.intecbrussel.oefening1.oefening1;

/**
 * Demo: elke subklasse geeft zijn eigen invulling aan makeSound(),
 * terwijl getName() gewoon geerfd wordt van Animal.
 */
public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        System.out.println(dog.getName()); // geerfde methode van Animal
        dog.makeSound();

        Cat cat = new Cat("Felix");
        System.out.println(cat.getName());
        cat.makeSound();

        Cow cow = new Cow("Bureonka");
        cow.makeSound();
    }
}
