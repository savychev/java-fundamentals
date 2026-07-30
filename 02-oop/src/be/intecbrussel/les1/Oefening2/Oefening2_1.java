package be.intecbrussel.les1.Oefening2;

/**
 * Oefening 2.1 - palindroomtest met StringBuilder.reverse().
 * Een woord is een palindroom als het omgekeerd hetzelfde leest.
 */
public class Oefening2_1 {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("madam");
        String str = input.toString(); // origineel bewaren VOOR reverse()

        StringBuilder inputReverse = new StringBuilder(input.reverse());
        String strReverse = inputReverse.toString();

        // equals() vergelijkt de INHOUD, == zou de referenties vergelijken
        if (str.equals(strReverse))
            System.out.println("The word " + str + " is a palindrome.");
        else
            System.out.println("The word " + str + " is not a palindrome.");
    }
}
