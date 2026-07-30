package be.intecbrussel;
import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter username ");
        String name = myScanner.nextLine();

        System.out.println("Enter adress ");
        String adress = myScanner.nextLine();

        System.out.println("Enter phone number ");
        String phone = myScanner.nextLine();


        System.out.println("Username: " + name);
        System.out.println("Adress: " + adress);
        System.out.println("Phone number: " + phone);
    }
}
