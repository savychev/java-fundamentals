package robots;

/**
 * Robot die de boot-methode overschrijft: hij toont zijn naam omgekeerd.
 * Omdat Robot boot() in de CONSTRUCTOR aanroept, wordt deze override al
 * tijdens het aanmaken uitgevoerd (klassieke valkuil!).
 */
public class CrazyRobot extends Robot {

    public CrazyRobot() {
        this("Unknown");
    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public void boot() {
        super.boot(); // eerst het normale bootgedrag
        String reversedName = new StringBuilder(getUnitName()).reverse().toString();
        System.out.println("Crazy boot! Reversed name: " + reversedName);
    }

    @Override
    public String toString() {
        return "CrazyRobot{} " + super.toString();
    }
}
