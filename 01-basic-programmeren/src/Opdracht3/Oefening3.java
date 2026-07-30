package Opdracht3;

// Schrijf een programma dat test of een nummer even of oneven is.

public class Oefening3 {
    public static void main(String[] args) {
        int num = 9;

        String result = num % 2 == 0 ? num + " is even" : num + " is odd";

        System.out.println(result);
    }
}
