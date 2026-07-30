package be.intecbrussel.les1.overriding;

public class Car extends Vehicle {
    @Override
    public void makeASound() {
        System.out.println("Vroem vroem");
    }
}