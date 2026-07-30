package be.intecbrussel.les3;

import java.util.Scanner;

/** Test: lege invoer detecteren met nextLine() en isEmpty(). */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een waarde in: ");

        String input = scanner.nextLine(); // leest de hele regel in

        if (input.isEmpty()) {
            System.out.println("Je hebt een lege waarde ingevoerd.");
        } else {
            System.out.println("Je hebt ingevoerd: " + input);
        }

        scanner.close(); // Scanner netjes sluiten als je hem niet meer nodig hebt
    }
}
