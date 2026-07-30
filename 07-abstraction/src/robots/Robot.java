package robots;

public class Robot {
    private String unitName;

    public Robot() {
        this("Unknown");
    }

    public Robot(String unitName) {
        this.unitName = unitName;
        this.boot();
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
