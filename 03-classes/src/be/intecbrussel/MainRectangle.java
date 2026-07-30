package be.intecbrussel;

public class MainRectangle {
    public static void main(String[] args) {
        OefeningRectangle rectangle = new OefeningRectangle(2, 5); // constructor call

        System.out.println(rectangle.getArea()); // 10

        rectangle.setLength(10);
        rectangle.setWidth(25);

        System.out.println(rectangle.getArea()); // 250
        System.out.println(rectangle.getPerimeter()); // 70
    }
}
