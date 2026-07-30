package be.intecbrussel.oefening6.oefening2;

import java.util.Scanner;

/**
 * Oefening: gebruikersinvoer omzetten naar een enum-constante met valueOf()
 * en die in een switch gebruiken.
 * Let op: valueOf() gooit een IllegalArgumentException bij een onbekende naam.
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the day of week: ");
        // toUpperCase() omdat de constantennamen in hoofdletters staan.
        String input = scanner.nextLine().toUpperCase();

        switch (Week.valueOf(input)) {
            case MONDAY:
                System.out.println("It's monday");
                break;
            case TUESDAY:
                System.out.println("It's tuesday");
                break;
            case WEDNESDAY:
                System.out.println("It's wednesday");
                break;
            case THURSDAY:
                System.out.println("It's thursday");
                break;
            case FRIDAY:
                System.out.println("It's FRIDAY !!!");
                break;
            case SATURDAY:
                System.out.println("It's saturday");
                break;
            case SUNDAY:
                System.out.println("It's sunday");
        }

        scanner.close();
    }
}
