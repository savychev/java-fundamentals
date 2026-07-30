package Opdracht3;

/** Oefening: test of een getal even of oneven is met de ternaire operator. */
public class Oefening3 {
    public static void main(String[] args) {
        int num = 9;

        // modulo 2: rest 0 betekent even, anders oneven
        String result = num % 2 == 0 ? num + " is even" : num + " is odd";

        System.out.println(result);
    }
}
