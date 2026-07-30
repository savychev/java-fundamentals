package be.intecbrussel.les2.oefening5;

public class Triangle extends Shape {
    public double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double getArea(double a, double b, double c) {
        double s = this.getPerimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
