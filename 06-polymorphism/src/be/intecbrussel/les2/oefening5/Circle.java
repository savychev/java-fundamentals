package be.intecbrussel.les2.oefening5;

public class Circle extends Shape {
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
