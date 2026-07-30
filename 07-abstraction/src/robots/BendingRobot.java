package robots;

public class BendingRobot extends Robot {
    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double angle) {
        if (angle > maxBendAngle)
            System.out.println("Het buigen niet mogelijk is.");
        else
            System.out.println("Het is gelukt");
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                "} " + super.toString();
    }
}
