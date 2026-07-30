package be.intecbrussel.les1;

public class Car2  extends Vehicle2 {
    public Car2() {
        System.out.println("No-args constructor Car");
    }

    public Car2(String typeOfVehicle) {
        super(typeOfVehicle);
        System.out.println("Car constructor");
    }
}
