package oefeningen.oefening3;

public class MainApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.toggleSwitch();
        car.gas();

        System.out.println("");

        car.openDoor(0);
        car.gas();
        car.closeDoor(0);
        car.gas();

        System.out.println("");

        car.toggleSwitch();
    }
}
