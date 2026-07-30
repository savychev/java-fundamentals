package be.intecbrussel.opdracht1;

/**
 * Subklasse: een SUV met bullbar en vierwielaandrijving (AWD).
 * Met AWD ingeschakeld is de topsnelheid beperkt tot 30.
 */
public class SUV extends Car {
    private boolean bullbar;
    private boolean isAWDOn;

    public boolean getBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    /** Zet de vierwielaandrijving aan of uit. */
    public void allWheelDrive(boolean aWD) {
        this.isAWDOn = aWD;
    }

    @Override
    public void accelerate(int amount) {
        int newSpeed = getSpeed() + (amount + (getHp() / 100));

        if (isAWDOn) {
            newSpeed = Math.min(newSpeed, 30); // AWD begrenst de snelheid
        }

        setSpeed(newSpeed);
    }

    @Override
    public String toString() {
        return super.toString() + ", SUV{" + // eerst de Car-velden, dan de eigen velden
                "bullbar=" + bullbar +
                ", isAWDOn=" + isAWDOn +
                '}';
    }
}
