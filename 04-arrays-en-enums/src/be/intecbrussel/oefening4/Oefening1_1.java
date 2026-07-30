package be.intecbrussel.oefening4;

import java.util.Arrays;
import java.util.Collections;

/**
 * Variant van Oefening1 met een primitieve double[]:
 * daarvoor bestaat geen sort met Comparator, dus voor aflopende volgorde
 * lopen we achterstevoren door de oplopend gesorteerde array.
 */
public class Oefening1_1 {
    public static void main(String[] args) {
        double[] arrDouble = {
                3.14, 2.718, 1.618, 0.577, 1.414,
                9.81, 6.02223, 2.099, 1.0, 0.0,
                -273.15, 42.0, 7.77, 123.456, 9876.54321
        };

        Arrays.sort(arrDouble); // oplopend sorteren
        System.out.println(Arrays.toString(arrDouble));

        // Aflopend afdrukken: van de laatste index terug naar 0.
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            System.out.print(arrDouble[i] + ", ");
        }

        System.out.println("\n");

        String[] arrStr = {
                "appel", "boom", "fiets", "straat", "auto",
                "huis", "computer", "boek", "tafel", "stoel",
                "zon", "maan", "ster", "water", "vuur"
        };

        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));
        Arrays.sort(arrStr, Collections.reverseOrder()); // kan wel: String[] is een object-array
        System.out.println(Arrays.toString(arrStr));
    }
}
