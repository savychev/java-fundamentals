package robots;

public class CrazyRobot extends Robot
{
    public CrazyRobot() {
        this("Unknown");
    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public void boot() {
        super.boot();
        String reversedName = new StringBuilder(getUnitName()).reverse().toString();
        System.out.println("Crazy boot! Reversed name: " + reversedName);
    }

    @Override
    public String toString() {
        return "CrazyRobot{} " + super.toString();
    }
}
