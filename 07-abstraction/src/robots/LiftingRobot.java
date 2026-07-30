package robots;

public class LiftingRobot extends Robot {
    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double height) {
        if (height > maxLiftHeight)
            System.out.println("Het liften niet mogelijk is.");
        else
            System.out.println("Het is gelukt");
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                "} " + super.toString();
    }
}
