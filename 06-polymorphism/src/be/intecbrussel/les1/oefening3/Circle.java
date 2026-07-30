package be.intecbrussel.les1.oefening3;

/**
 * Cirkel: overschrijft de varianten met een straal (1 parameter).
 */
public class Circle extends Shape {
    @Override
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
