package oefeningen.oefening3;

/** Demo: de auto rijdt alleen als de motor draait EN alle deuren dicht zijn. */
public class MainApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.toggleSwitch(); // motor aan
        car.gas();          // rijdt

        System.out.println();

        car.openDoor(0);    // deur open -> rijden geblokkeerd
        car.gas();
        car.closeDoor(0);
        car.gas();          // weer ok

        System.out.println();

        car.toggleSwitch(); // motor uit
    }
}
