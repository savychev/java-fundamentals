package be.intecbrussel.Circle;

/**
 * Klasse-voorbeeld met constructor-chaining: de copy-constructor
 * hergebruikt via this(...) een andere constructor. Een static teller
 * houdt bij hoeveel cirkels er gemaakt zijn.
 */
public class Circle {
    public static final int ANGLES = 0; // constante: een cirkel heeft geen hoeken
    private static int count;           // static: telt ALLE aangemaakte cirkels
    private int x;
    private int y;
    private int radius;

    public Circle() {
        this.radius = 1; // standaardwaarde voor de straal
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

    // copy-constructor: maakt een kopie via constructor-chaining met this(...)
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
        return Math.PI * Math.pow(radius, 2); // pi * r^2
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius; // 2 * pi * r
    }

    public void grow(int d) {
        this.radius += d;
    }

    public static int getCount() {
        return count;
    }
}
