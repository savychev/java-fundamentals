package Opdracht2;

import java.util.Scanner;

/** Oefening: korting op lidgeld optellen via meerdere if's, met een maximum via de ternaire operator. */
public class Opd4LidGeld {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double discount = 0;

        System.out.print("Enter your age ");
        int age = myScanner.nextInt();

        System.out.println("Enter the number of children ");
        int numChildren = myScanner.nextInt();

        System.out.println("Enter the annual income (EUR)");
        int income = myScanner.nextInt();

        // Elke voorwaarde voegt onafhankelijk korting toe
        if (age > 50) {
            discount += 2;
        }
        if (numChildren > 0) {
            discount += 1 * numChildren; // 1 euro korting per kind
        }
        if (income < 12500) {
            discount += 2.5;
        }

        // De totale korting is begrensd op 8.5
        discount = discount > 8.5 ? 8.5 : discount;

        System.out.println(discount);
    }
}
