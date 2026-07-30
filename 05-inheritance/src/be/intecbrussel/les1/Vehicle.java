package be.intecbrussel.les1;

/**
 * Superklasse (parent): de klasse waarvan Car erft.
 * Alles wat hier public is, is ook via een Car-object bruikbaar.
 */
public class Vehicle {
    private String typeOfVehicle = "Car";

    public Vehicle() {
        // Deze constructor wordt ALTIJD eerst uitgevoerd, ook bij new Car().
        System.out.println("Vehicle class constructor");
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void honk() {
        System.out.println("Toet toet! I'm super!");
    }
}
