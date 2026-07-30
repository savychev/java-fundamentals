package be.intecbrussel.opdracht1;

public class SUV extends Car {
    private boolean bullbar;
    private boolean isAWDOn;

    public boolean getBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void allWheelDrive(boolean aWD) {
    }

    @Override
    public void accelerate(int amount) {
        int hp = getHp();
        int speed = getSpeed();
        int newSpeed = speed + (amount + (hp / 100));

        if (isAWDOn)
            newSpeed = Math.min(newSpeed, 30);

        setSpeed(newSpeed);
    }

    @Override
    public String toString() {
        return super.toString() + ", SUV{" +
                "bullbar=" + bullbar +
                ", isAWDOn=" + isAWDOn +
                '}';
    }
}
