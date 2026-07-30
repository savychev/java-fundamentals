package oefeningen.oefening5;

/**
 * Zaklamp die tegen de interface programmeert: ze werkt met ELKE
 * Battery-implementatie, zonder de concrete merken te kennen
 * (losse koppeling / dependency injection via de constructor).
 */
public class Flashlight {

    private Battery battery; // type is de interface, niet een concreet merk

    public Flashlight(Battery battery) {
        this.battery = battery;
        System.out.println("De zaklamp is klaar. Vermogen: " + battery.deliverPower());
    }

    @Override
    public String toString() {
        return "Flashlight{" +
                "battery=" + battery.getClass().getSimpleName() +
                '}';
    }
}
