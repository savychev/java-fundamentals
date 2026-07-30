package be.intecbrussel.les1.oefening3;

/**
 * Vormen via een Shape-referentie: de runtime klasse bepaalt de berekening.
 */
public class MainApp {
    public static void main(String[] args) {
        Shape circle = new Circle(); // upcasting
        System.out.println(circle.getPerimeter(15)); // dynamic dispatch -> Circle
        System.out.println(circle.getArea(15));
        System.out.println();

        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getPerimeter(20, 30));
        System.out.println(rectangle.getArea(20, 30));
        System.out.println();

        Shape triangle = new Triangle();
        System.out.println(triangle.getPerimeter(10, 12, 15));
        System.out.println(triangle.getArea(10, 12, 15));
    }
}
