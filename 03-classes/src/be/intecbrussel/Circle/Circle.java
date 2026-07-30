package be.intecbrussel.Circle;

// Ik ben nog bezig met deze opdracht

public class Circle {
    public static final int ANGLES = 0;
    private static int count;
    private int x;
    private int y;
    private int radius;

    public Circle() {
        this.radius = 1; // set default value for radius
        count++;
    }

    public Circle(int radius) {
        this.radius = radius;
        count++;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        count++;
    }

    public Circle(Circle c) {
        this(c.radius, c.x, c.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void grow(int d) {
        this.radius += d;
    }

    public static int getCount() {
        return count;
    }
}
