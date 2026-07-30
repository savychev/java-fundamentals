package be.intecbrussel.oefening7;

public class MainApp {
    public static void main(String[] args) {
        PlanetaryCircumference obj = new PlanetaryCircumference();

        // calculations
        System.out.println("Circumference of the Sun: " + obj.calculateCircumference(obj.RADIUS_SUN) + " km");
        System.out.println("Circumference of the Earth: " + obj.calculateCircumference(obj.RADIUS_EARTH) + " km");
        System.out.println("Circumference of the Moon: " + obj.calculateCircumference(obj.RADIUS_MOON) + " km");
    }
}