package be.intecbrussel.les3;

import java.util.Scanner;

/** Oefening: even/oneven bepalen met invoervalidatie via hasNextInt(). */
public class Oefening5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println(".. Welcome to EvenOdd ..");
        System.out.println("Please enter a number:");

        if (myScanner.hasNextInt()) { // controleert of de invoer een geheel getal is
            int num = myScanner.nextInt(); // zo ja, dan wordt het resultaat opgeslagen in 'num'

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Error! It's not a number!");
        }
    }
}
