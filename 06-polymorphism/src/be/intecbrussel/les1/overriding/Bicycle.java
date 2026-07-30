package be.intecbrussel.les1.overriding;

public class Bicycle extends Vehicle {
    @Override
    public void makeASound() {
        System.out.println("Brr-rr Brr-rr");
    }
}
