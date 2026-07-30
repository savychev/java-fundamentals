package be.intecbrussel.opdracht1;

/**
 * Subklasse: een cabrio met een dak dat open en dicht kan.
 */
public class Cabrio extends Car {
    private boolean sunroof;

    public boolean getSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    /** Wisselt de stand van het dak: open wordt dicht en omgekeerd. */
    public void openRoof() {
        setSunroof(!getSunroof());
    }

    @Override
    public String toString() {
        return super.toString() + ", Cabrio{" +
                "sunroof=" + sunroof +
                '}';
    }
}
