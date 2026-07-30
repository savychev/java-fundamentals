package be.intecbrussel.les2.oefening5;

public class MainApp {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.getPerimeter(15));
        System.out.println(circle.getArea(15));
        System.out.println(circle instanceof Shape);
        System.out.println(" ");

        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getPerimeter(20, 30));
        System.out.println(rectangle.getArea(20, 30));
        System.out.println(rectangle instanceof Shape);
        System.out.println(" ");

        Shape triangle = new Triangle();
        System.out.println(triangle.getPerimeter(10, 12, 15));
        System.out.println(triangle.getArea(10,12, 15));
        System.out.println(triangle instanceof Shape);
    }
}
