package Opdracht1;

import java.util.Scanner;

public class WhileExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Enter the number between 0 and 10");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num > 0 && num < 10) {
                    System.out.println("Success! Your number is " + num);
                    break;
                } else
                    continue;
            }
            scanner.next();
        }
    }
}