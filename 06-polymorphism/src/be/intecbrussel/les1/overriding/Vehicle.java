package be.intecbrussel.les1.overriding;

/**
 * Voertuig met standaardgeluid; subklassen geven hun eigen invulling.
 */
public class Vehicle {
    public void makeASound() {
        System.out.println("?????"); // een generiek voertuig heeft geen eigen geluid
    }
}
