package Opdracht2;

import java.util.Scanner;

public class Opd7Geometry {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int figure;
        String result = "";

        System.out.print("Enter the name of figure: ");
        figure = myScanner.nextInt();

        switch (figure) {
            case 1:
                System.out.print("Enter the length of the first side: ");
                int side1 = myScanner.nextInt();
                System.out.print("Enter the length of the second side: ");
                int side2 = myScanner.nextInt();
                result = "The ares of the rectangle is " + side1 * side2;
                break;
            case 2:
                System.out.println("Enter the base of the triangle: ");
                int base = myScanner.nextInt();
                System.out.println("Enter the height of the triangle: ");
                int height = myScanner.nextInt();
                result = "The area of the triangle is " + base * height / 2;
                break;
            case 3:
                System.out.println("Enter the radius of the circle: ");
                double radius = myScanner.nextInt();
                result = "The area of the circle is " + Math.PI * radius * radius;
        }

        System.out.print(result);
    }
}