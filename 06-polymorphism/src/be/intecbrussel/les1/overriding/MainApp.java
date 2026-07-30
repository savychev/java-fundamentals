package be.intecbrussel.les1.overriding;

/**
 * Method overriding: de Vehicle-referentie voert de subklasse-versie uit.
 */
public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();   // upcasting
        car.makeASound();          // dynamic dispatch -> "Vroem vroem"

        Vehicle bicycle = new Bicycle();
        bicycle.makeASound();      // dynamic dispatch -> "Brr-rr Brr-rr"
    }
}
