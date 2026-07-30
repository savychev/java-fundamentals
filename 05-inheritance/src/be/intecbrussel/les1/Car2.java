package be.intecbrussel.les1;

/**
 * Subklasse van Vehicle2: toont super(...) met een argument.
 * Zonder expliciete super(...)-aanroep voegt de compiler zelf super() toe.
 */
public class Car2 extends Vehicle2 {
    public Car2() {
        // Impliciet wordt hier eerst super() (de no-args constructor) uitgevoerd.
        System.out.println("No-args constructor Car");
    }

    public Car2(String typeOfVehicle) {
        super(typeOfVehicle); // bewust de superconstructor MET parameter kiezen
        System.out.println("Car constructor");
    }
}
