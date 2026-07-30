package be.intecbrussel.les2.Oefening5;

import java.util.Random;
import java.util.Scanner;


public class Oefening5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int numRandom = random.nextInt(1, 10);

            System.out.print("Enter the number between 1 and 10: ");
            int numUser = scanner.nextInt();

            if (numUser == 0) { // to exit, enter 0
                System.out.println("Bye...");
                break;
            } else {
                if (numRandom == numUser) {
                    System.out.println("You guessed it!");
                } else {
                    System.out.println("Nope, try again...");
                }
            }
        }
    }
}
