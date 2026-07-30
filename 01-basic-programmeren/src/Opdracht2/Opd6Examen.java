package Opdracht2;

import java.util.Scanner;

/** Oefening: examenresultaat bepalen met een samengestelde voorwaarde (&&) en geneste if's. */
public class Opd6Examen {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int mathematics;
        int accounting;
        int it;
        String result;

        System.out.print("Mathematics: ");
        mathematics = myScanner.nextInt();

        System.out.print("Accounting: ");
        accounting = myScanner.nextInt();

        System.out.print("IT: ");
        it = myScanner.nextInt();

        // Geslaagd: minstens 6 voor wiskunde EN samen minstens 12 voor accounting + IT
        if (mathematics >= 6 && (accounting + it) >= 12)
            result = "You passed the exam!";
        else {
            result = "You didn't pass the exam. ";
            // Leg per niet-gehaalde voorwaarde uit wat er ontbrak
            if (mathematics < 6)
                result += "You got " + mathematics + " points in mathematics, but 6 are required. ";
            if ((accounting + it) < 12)
                result += "You got " + (accounting + it) + " points in total for accounting and IT, but 12 are required.";
        }

        System.out.println(result);
    }
}
