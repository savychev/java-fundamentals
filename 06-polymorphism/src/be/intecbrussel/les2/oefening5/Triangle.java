package be.intecbrussel.les2.oefening5;

/**
 * Driehoek: omtrek en oppervlakte (formule van Heron).
 */
public class Triangle extends Shape {
    @Override
    public double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    @Override
    public double getArea(double a, double b, double c) {
        double s = this.getPerimeter(a, b, c) / 2; // halve omtrek
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
