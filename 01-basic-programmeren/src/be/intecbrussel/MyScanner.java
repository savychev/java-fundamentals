package be.intecbrussel;
import java.util.Scanner;


public class MyScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter username ");
        String name = myScanner.nextLine();


        System.out.println("Enter age ");
        int age = myScanner.nextInt();

        System.out.println("Enter salary ");
        double salary = myScanner.nextDouble();


        System.out.println("Username is: " + name);
        System.out.println("Username is: " + age);
        System.out.println("Username is: " + salary);

    }

}
