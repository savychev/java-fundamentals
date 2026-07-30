package be.intecbrussel;

import java.util.Scanner;

/** Demonstreert invoer lezen met Scanner: nextLine(), nextInt() en nextDouble(). */
public class MyScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter username ");
        String name = myScanner.nextLine(); // leest een hele regel tekst

        System.out.println("Enter age ");
        int age = myScanner.nextInt(); // leest een geheel getal

        System.out.println("Enter salary ");
        double salary = myScanner.nextDouble(); // leest een kommagetal

        System.out.println("Username is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }
}
