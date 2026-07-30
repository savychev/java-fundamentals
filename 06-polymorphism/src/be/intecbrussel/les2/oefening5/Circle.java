package be.intecbrussel.les2.oefening5;

/**
 * Cirkel: overschrijft de varianten met een straal.
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
