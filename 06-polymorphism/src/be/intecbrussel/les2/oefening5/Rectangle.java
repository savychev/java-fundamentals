package be.intecbrussel.les2.oefening5;

/**
 * Rechthoek: overschrijft de varianten met breedte en hoogte.
 */
public class Rectangle extends Shape {
    @Override
    public double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }

    @Override
    public double getArea(double width, double height) {
        return width * height;
    }
}
