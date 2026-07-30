package be.intecbrussel.opdracht2;

/**
 * Opdracht: een kleine hulpklasse met statische methodes voor int-arrays:
 * controleren of een array gesorteerd is, sorteren (bubble sort) en zoeken.
 */
public class IntArrayTools {

    /** Controleert of de array gesorteerd is, oplopend of aflopend. */
    public static boolean isSorted(int[] arr, boolean ascending) {
        // Elk element vergelijken met zijn rechterbuur.
        for (int i = 0; i < arr.length - 1; i++) {
            if (ascending) {
                if (arr[i] > arr[i + 1]) {
                    return false; // groter element voor een kleiner: niet oplopend
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    return false; // kleiner element voor een groter: niet aflopend
                }
            }
        }
        return true;
    }

    /**
     * Sorteert een KOPIE van de array met bubble sort en geeft die terug.
     * Het origineel blijft dus ongewijzigd.
     */
    public static int[] sort(int[] array, boolean ascending) {
        int[] arr = array.clone(); // kopie, zodat de aanroeper zijn array behoudt

        // Bubble sort: buren omwisselen tot alles op zijn plaats staat.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    int temp = arr[j]; // klassieke swap via een tijdelijke variabele
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /** Lineair zoeken: true zodra de waarde ergens in de array voorkomt. */
    public static boolean chopSearch(int[] array, int value) {
        for (int a : array) {
            if (a == value) {
                return true;
            }
        }
        return false; // hele array doorlopen zonder match
    }
}
