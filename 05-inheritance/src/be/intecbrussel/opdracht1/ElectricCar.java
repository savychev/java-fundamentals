package be.intecbrussel.opdracht1;

public class ElectricCar extends Car {
    private int battery;

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void accelerate(int amount) {
        int battery = getBattery();
        int speed = getSpeed();
        int newSpeed = speed + (amount + (battery / 100));

        setSpeed(newSpeed);
    }

    public void slow(int amount) {
    }

    public void park() {
    }

    public void charge(int amount) {
    }

    @Override
    public String toString() {
        return super.toString() + ", ElectricCar{" +
                "battery=" + battery +
                '}';
    }
}
