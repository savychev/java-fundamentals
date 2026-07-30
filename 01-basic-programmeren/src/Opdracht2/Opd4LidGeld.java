package Opdracht2;

import java.util.Scanner;

public class Opd4LidGeld {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double discount = 0;

        System.out.print("Enter your age ");
        int age = myScanner.nextInt();

        System.out.println("Enter the number of children ");
        int numChildren = myScanner.nextInt();

        System.out.println("Enter the annual income (€)");
        int income = myScanner.nextInt();

        if (age > 50) {
            discount += 2;
        }

        if (numChildren > 0) {
            discount += 1 * numChildren;
        }

        if (income < 12500) {
            discount += 2.5;
        }

        discount = discount > 8.5 ? 8.5 : discount;

        System.out.println(discount);
    }
}