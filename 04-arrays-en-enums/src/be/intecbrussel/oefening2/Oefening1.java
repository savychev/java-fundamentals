package be.intecbrussel.oefening2;

/**
 * Oefening: de som van alle elementen berekenen met een for-each.
 */
public class Oefening1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;

        for (int value : myArray) {
            result += value; // telkens het element bij het totaal optellen
        }

        System.out.println(result); // 55
    }
}
