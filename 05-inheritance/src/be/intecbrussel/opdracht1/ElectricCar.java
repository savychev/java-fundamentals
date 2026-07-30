package be.intecbrussel.opdracht1;

/**
 * Subklasse: een elektrische auto. De snelheidswinst hangt hier af
 * van de batterijlading in plaats van het aantal pk.
 */
public class ElectricCar extends Car {
    private int battery; // lading in procent (0-100)

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public void accelerate(int amount) {
        // Zelfde formule als in Car, maar met de batterij in plaats van pk.
        int newSpeed = getSpeed() + (amount + (getBattery() / 100));
        setSpeed(newSpeed);
    }

    @Override
    public void slow(int amount) {
        int newSpeed = getSpeed() - (amount + (getBattery() / 100));
        setSpeed(newSpeed);
    }

    /** Laadt de batterij bij, met 100% als maximum. */
    public void charge(int amount) {
        battery = Math.min(100, battery + amount);
    }

    @Override
    public String toString() {
        return super.toString() + ", ElectricCar{" +
                "battery=" + battery +
                '}';
    }
}
