package robots;

/**
 * Basisklasse voor alle robots. Concreet (niet abstract), zodat ook een
 * "gewone" robot aangemaakt kan worden.
 */
public class Robot {

    private String unitName;

    public Robot() {
        this("Unknown"); // constructor-chaining naar de andere constructor
    }

    public Robot(String unitName) {
        this.unitName = unitName;
        this.boot(); // let op: overridebare methode in een constructor (zie CrazyRobot)
    }

    public void boot() {
        System.out.println("The robot " + this.getUnitName() + " is booting.");
    }

    public String getUnitName() {
        return unitName;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
