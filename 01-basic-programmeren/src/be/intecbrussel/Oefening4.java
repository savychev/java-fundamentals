package be.intecbrussel;

import java.util.Scanner;

/** Oefening: meerdere regels tekst inlezen met nextLine() en netjes terug afdrukken. */
public class Oefening4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter username ");
        String name = myScanner.nextLine();

        System.out.println("Enter address ");
        String address = myScanner.nextLine();

        System.out.println("Enter phone number ");
        String phone = myScanner.nextLine();

        System.out.println("Username: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phone);
    }
}
