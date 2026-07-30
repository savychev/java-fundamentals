package be.intecbrussel.test;

import java.util.Arrays;

/**
 * Verzameling statische hulpmethodes voor int-arrays: sorteren, som,
 * gemiddelde, omkeren, statistieken en gemeenschappelijke waarden zoeken.
 */
public class IntegerArrayUtils {

    /**
     * Sorteert een KOPIE van de array met bubble sort (oplopend of aflopend).
     * Het origineel blijft ongewijzigd.
     */
    public static int[] sort(int[] array, boolean ascending) {
        int[] arr = array.clone(); // kopie, zodat de aanroeper zijn array behoudt

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

    /** Berekent het gemiddelde. De som is een double om integer-deling te vermijden. */
    public static double getAverageIntArray(int[] arrayOfIntegers) {
        double sum = 0;

        for (int v : arrayOfIntegers) {
            sum += v;
        }

        return sum / arrayOfIntegers.length;
    }

    /** Telt alle elementen op. */
    public static int getSumIntArray(int[] arrayOfIntegers) {
        int sum = 0;

        for (int v : arrayOfIntegers) {
            sum += v;
        }

        return sum;
    }

    /** Maakt een array van 10 elementen: 0, increment, 2*increment, ... */
    public static int[] generateArrayWithIncrement(int increment) {
        int[] myArr = new int[10];
        int i = 0;

        while (i < myArr.length) {
            myArr[i] = i * increment; // index maal de stapgrootte
            i++;
        }
        return myArr;
    }

    /** Controleert of de array oplopend gesorteerd is. */
    public static boolean isSorted(int[] arrayOfIntegers) {
        for (int i = 0; i < arrayOfIntegers.length - 1; i++) {
            if (arrayOfIntegers[i] > arrayOfIntegers[i + 1]) {
                return false; // een groter element voor een kleiner: niet gesorteerd
            }
        }
        return true;
    }

    /**
     * Keert de array IN PLACE om: het eerste element wisselt met het laatste,
     * het tweede met het voorlaatste, enzovoort tot het midden bereikt is.
     */
    public static void reverseArray(int[] arrToReverse) {
        System.out.println(Arrays.toString(arrToReverse));
        int lastIndex = arrToReverse.length - 1; // de laatste index
        for (int i = 0; i < arrToReverse.length / 2; i++) {
            int temp = arrToReverse[lastIndex];
            arrToReverse[lastIndex] = arrToReverse[i];
            arrToReverse[i] = temp;
            lastIndex--; // van achteren naar het midden toe schuiven
        }
        System.out.println(Arrays.toString(arrToReverse));
    }

    /** Geeft min, max, gemiddelde en som terug als leesbare String-array. */
    public static String[] getIntArrayData(int[] arrayOfIntegers) {
        String[] result = new String[4];
        int[] sortedArray = sort(arrayOfIntegers, true); // gesorteerde kopie

        int min = sortedArray[0]; // na het sorteren staat het minimum vooraan...
        int max = sortedArray[sortedArray.length - 1]; // ...en het maximum achteraan
        double avg = getAverageIntArray(arrayOfIntegers);
        int sum = getSumIntArray(arrayOfIntegers);

        result[0] = "The minimum value is: " + min;
        result[1] = "The maximum value is: " + max;
        result[2] = "The average value is: " + avg;
        result[3] = "The sum is: " + sum;

        return result;
    }

    /**
     * Zoekt waarden die in beide arrays voorkomen.
     * Elke match wordt twee keer opgeslagen (een uit elke array).
     */
    public static int[] findDuplicates(int[] firstArray, int[] secondArray) {
        int len = 0; // aantal gevonden matches
        int i = 0;
        int[] tempArray = new int[10]; // tijdelijke buffer, ruim genoeg voor deze oefening

        // Elke combinatie van elementen uit beide arrays vergelijken.
        for (int v : firstArray) {
            for (int w : secondArray) {
                if (v == w) {
                    len++;
                    tempArray[i] = v;
                    tempArray[i + 1] = w;
                    i = i + 2;
                }
            }
        }

        // De buffer inkorten tot het exacte aantal gevonden waarden.
        int[] result = new int[len * 2];

        int ii = 0;
        while (ii < result.length) {
            result[ii] = tempArray[ii];
            ii++;
        }

        return result;
    }
}
