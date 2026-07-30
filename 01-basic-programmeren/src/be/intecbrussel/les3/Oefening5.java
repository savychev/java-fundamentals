package be.intecbrussel.les3;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println(".. Welcome to EvenOdda ..");
        System.out.println("Please enter a number:");

        if (myScanner.hasNextInt()) { // dit method contoleert of dit getal is
            int num = myScanner.nextInt(); // als wel dan result slaat op in de variable 'num'

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Error! It's not number!");
        }
    }
}