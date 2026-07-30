package Opdracht1;

import java.util.Scanner;

/** Demonstreert invoervalidatie: een oneindige lus met hasNextInt(), break en continue. */
public class WhileExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) { // bewust oneindige lus; break beëindigt hem
            System.out.println("Enter the number between 0 and 10");
            if (scanner.hasNextInt()) { // controleer eerst of de invoer een geheel getal is
                num = scanner.nextInt();
                if (num > 0 && num < 10) {
                    System.out.println("Success! Your number is " + num);
                    break; // geldige invoer: verlaat de lus
                } else
                    continue; // getal buiten bereik: opnieuw vragen
            }
            scanner.next(); // ongeldige (niet-numerieke) invoer wegwerpen
        }
    }
}
