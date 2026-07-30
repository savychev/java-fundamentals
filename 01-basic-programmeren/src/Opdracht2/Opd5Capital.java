package Opdracht2;

import java.util.Scanner;

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
            capital += capital / 100 * rate;
            term--;
        }

        System.out.println(capital);

    }
}