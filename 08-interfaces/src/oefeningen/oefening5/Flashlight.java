package oefeningen.oefening5;

public class Flashlight {
    private Battery battery;

    public Flashlight(Battery battery) {
        this.battery = battery;
        System.out.println("Object is compleet. Power: " + battery.deliverPower());
    }

    @Override
    public String toString() {
        return "Flashlight{" +
                "battery=" + battery +
                '}';
    }
}