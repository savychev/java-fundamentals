package be.intecbrussel;
import java.util.Scanner;


public class Oefening3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int num1 = myScanner.nextInt();

        System.out.println("Enter 2nd number ");
        int num2 = myScanner.nextInt();

        int sum = num1 + num2;
        int min = num1 - num2;
        int verm = num1 * num2;
        int del = num1 / num2;
        int delen = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + min);
        System.out.println(num1 + " * " + num2 + " = " + verm);
        System.out.println(num1 + " / " + num2 + " = " + del);
        System.out.println(num1 + " % " + num2 + " = " + delen);
    }
}
