package be.intecbrussel.oefening6.oefening1;

/**
 * Oefening: alle enum-constanten aflopen met values()
 * en hun positie tonen met ordinal().
 */
public class MainApp {
    public static void main(String[] args) {
        Week[] weekArr = Week.values(); // alle dagen als array
        for (Week day : weekArr) {
            System.out.println(day + " at index " + day.ordinal());
        }
    }
}
