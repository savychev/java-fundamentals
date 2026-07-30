package robots;

/**
 * Robot die kan buigen tot een maximale hoek.
 */
public class BendingRobot extends Robot {

    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName); // eerst de basisklasse initialiseren
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double angle) {
        if (angle > maxBendAngle)
            System.out.println("Het buigen is niet mogelijk."); // buiten bereik
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
