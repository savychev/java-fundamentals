package be.intecbrussel.opdracht1;

/**
 * Opdracht: superklasse voor alle autotypes (SUV, Cabrio, ElectricCar).
 * Bevat de gemeenschappelijke velden en het basisgedrag voor
 * versnellen, vertragen en parkeren.
 */
public class Car {
    private String color;
    private int speed;
    private int hp; // vermogen in pk

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    /** Versnelt: hoe meer pk, hoe groter de extra snelheidswinst. */
    public void accelerate(int amount) {
        int newSpeed = getSpeed() + (amount + (getHp() / 100));
        setSpeed(newSpeed);
    }

    /** Vertraagt volgens dezelfde formule als accelerate(). */
    public void slow(int amount) {
        int newSpeed = getSpeed() - (amount + (getHp() / 100));
        setSpeed(newSpeed);
    }

    /** Parkeren: de snelheid gaat naar 0. */
    public void park() {
        setSpeed(0);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
