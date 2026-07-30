package be.intecbrussel.les1.oefening3;

public class Rectangle extends Shape {
    public double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public double getArea(double width, double height) {
        return width * height;
    }
}