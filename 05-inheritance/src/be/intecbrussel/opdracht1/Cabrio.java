package be.intecbrussel.opdracht1;

public class Cabrio extends Car {
    private boolean sunroof;

    public boolean getSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public void openRoof() {
        setSunroof(!getSunroof());
    }

    @Override
    public String toString() {
        return super.toString() +", Cabrio{" +
                "sunroof=" + sunroof +
                '}';
    }
}
