package be.intecbrussel.les1.overriding;

/**
 * Fiets: eigen versie van makeASound().
 */
public class Bicycle extends Vehicle {
    @Override
    public void makeASound() {
        System.out.println("Brr-rr Brr-rr");
    }
}
