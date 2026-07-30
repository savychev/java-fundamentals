package be.intecbrussel.les3.level;

public class MainApp {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        switch (level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
        }
    }
}
