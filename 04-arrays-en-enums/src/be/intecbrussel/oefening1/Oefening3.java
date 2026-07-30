package be.intecbrussel.oefening1;

/**
 * Oefening: met een for-each door een array lopen
 * en met modulo (%) even en oneven getallen onderscheiden.
 */
public class Oefening3 {
    public static void main(String[] args) {
        int[] arrayOfNums = {5, 14, 588, 55241, 78338};

        for (int value : arrayOfNums) {
            if (value % 2 == 0) // rest bij deling door 2 is 0 -> even
                System.out.println(value + " is even number.");
            else
                System.out.println(value + " is odd number.");
        }
    }
}
