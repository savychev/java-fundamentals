package be.intecbrussel.oefening1.oefening1;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        System.out.println(dog.getName());
//        dog.makeSound();

        Cat cat = new Cat("Felix");
        System.out.println(cat.getName());
//        cat.makeSound();
//
//        Cow cow = new Cow("Bureonka");
//        cow.makeSound();
    }
}
