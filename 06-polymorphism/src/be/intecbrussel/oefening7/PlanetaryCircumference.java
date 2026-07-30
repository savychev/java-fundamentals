package be.intecbrussel.oefening7;

/**
 * Oefening 7: final constanten en een final methode voor de omtrekberekening.
 */
public class PlanetaryCircumference {
    public static final double PI = 3.141592653589793;

    // final: de stralen zijn constanten en mogen niet meer wijzigen
    final double RADIUS_SUN = 696340;
    final double RADIUS_EARTH = 6371;
    final double RADIUS_MOON = 1737;

    public static final double calculateCircumference(double radius) {
        return 2 * PI * radius; // omtrek = 2 * pi * r
    }
}
