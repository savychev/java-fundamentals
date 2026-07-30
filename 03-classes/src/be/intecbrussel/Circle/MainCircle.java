package be.intecbrussel.Circle;

// Ik ben nog bezig met deze opdracht

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(20);
        Circle circle3 = new Circle(30, 1, 1);
        Circle circle4 = new Circle(circle3);

        int resultX = circle1.getX();
        System.out.println(resultX); // 0
        circle1.setX(222);
        resultX = circle1.getX();
        System.out.println(resultX); // 222

        System.out.println("\n");

        int resultY = circle1.getY();
        System.out.println(resultY); // 0
        circle1.setY(777);
        resultY = circle1.getY();
        System.out.println(resultY); // 777

        System.out.println("\n");

        int resultRadius = circle1.getRadius();
        System.out.println(resultRadius); // 0 ???????????????
        circle1.setRadius(10);
        resultRadius = circle1.getRadius();
        System.out.println(resultRadius); // 10

        System.out.println("\n");

        double resultArea = circle1.getArea();
        System.out.println(resultArea); // AREA
        double resultPerimeter = circle1.getPerimeter();
        System.out.println(resultPerimeter); // PERIMETER

        circle1.grow(3);
        resultRadius = circle1.getRadius();
        System.out.println(resultRadius); // 13

        System.out.println(Circle.getCount()); // 4

    }
}
