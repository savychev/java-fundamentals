package be.intecbrussel.oefening7;

/**
 * Berekent de omtrek van zon, aarde en maan.
 */
public class MainApp {
    public static void main(String[] args) {
        PlanetaryCircumference obj = new PlanetaryCircumference();

        System.out.println("Circumference of the Sun: " + PlanetaryCircumference.calculateCircumference(obj.RADIUS_SUN) + " km");
        System.out.println("Circumference of the Earth: " + PlanetaryCircumference.calculateCircumference(obj.RADIUS_EARTH) + " km");
        System.out.println("Circumference of the Moon: " + PlanetaryCircumference.calculateCircumference(obj.RADIUS_MOON) + " km");
    }
}
