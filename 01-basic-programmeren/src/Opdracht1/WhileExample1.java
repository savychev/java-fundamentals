package Opdracht1;

/** Demonstreert een aftellende while-lus: van 120 terug naar 100. */
public class WhileExample1 {
    public static void main(String[] args) {
        int i = 120; // initialisatie gebeurt vóór de lus

        while (i >= 100) {
            System.out.println(i);
            i--; // vergeet de update niet, anders krijg je een oneindige lus
        }
    }
}
