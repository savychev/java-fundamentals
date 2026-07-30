package be.intecbrussel.les3.level;

/**
 * Enum in een switch: in de case-labels schrijf je enkel de constante
 * (LOW, niet Level.LOW) - de compiler kent het type al.
 */
public class MainApp {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        switch (level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break; // zonder break valt de uitvoering door naar de volgende case
            case HIGH:
                System.out.println("High level");
        }
    }
}
