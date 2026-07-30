package Opdracht2;

import java.util.Scanner;

/** Oefening: samengestelde interest berekenen met een while-lus (één iteratie per jaar). */
public class Opd5Capital {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double capital;
        double rate;
        int term;

        System.out.print("Enter your initial capital ");
        capital = myScanner.nextDouble();

        System.out.println("Enter the rate");
        rate = myScanner.nextDouble();

        System.out.println("Enter the term");
        term = myScanner.nextInt();

        while (term > 0) {
            capital += capital / 100 * rate; // interest komt bij het kapitaal (samengesteld)
            term--;
        }

        System.out.println(capital);
    }
}
