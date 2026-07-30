package be.intecbrussel.les1.overriding;

/**
 * Auto: eigen versie van makeASound().
 */
public class Car extends Vehicle {
    @Override
    public void makeASound() {
        System.out.println("Vroem vroem");
    }
}
