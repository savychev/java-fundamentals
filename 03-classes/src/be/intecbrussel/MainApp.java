package be.intecbrussel;

/**
 * Demo bij Auto: de private no-arg constructor is niet bruikbaar,
 * enkel de publieke constructor met argumenten.
 */
public class MainApp {
    public static void main(String[] args) {
//        Auto auto1 = new Auto(); // compileert niet: constructor is private

        Auto auto = new Auto("Toyota", "Camry"); // object maken

        auto.getMessageCreation(); // methode aanroepen
    }
}
