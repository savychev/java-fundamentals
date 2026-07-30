package Opdracht1;

/** Demonstreert een aftellende for-lus: telt van 400 terug naar 350. */
public class ForExample1 {
    public static void main(String[] args) {
        // i-- verlaagt de teller bij elke iteratie
        for (int i = 400; i >= 350; i--) {
            System.out.println(i);
        }
    }
}
