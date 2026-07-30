package be.intecbrussel;
import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = myScanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = myScanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = myScanner.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = myScanner.nextInt();
        System.out.println("Enter fifth number: ");
        int num5 = myScanner.nextInt();

        int average = (num1+num2+num3+num4+num5)/5;

        System.out.println("Average of five numbers is: " + average);
    }
}