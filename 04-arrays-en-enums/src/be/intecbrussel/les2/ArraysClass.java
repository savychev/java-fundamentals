package be.intecbrussel.les2;

import java.util.Arrays;

/**
 * Overzicht van de belangrijkste hulpmethodes van java.util.Arrays:
 * toString(), copyOf(), equals(), fill(), sort() en binarySearch().
 */
public class ArraysClass {
    public static void main(String[] args) {

        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // toString(): leesbare weergave van een array (zonder dit krijg je een hashcode te zien).
        String strArr = Arrays.toString(myArr);
        System.out.println("Array: " + strArr);

        // copyOf(): kopieert naar een nieuwe array met de gevraagde lengte.
        // De kopie aanpassen verandert het origineel NIET.
        System.out.println("\n" + Arrays.toString(myArr));
        int[] newArr = Arrays.copyOf(myArr, 5);
        newArr[3] = 11;
        newArr[4] = 55;
        System.out.println(Arrays.toString(newArr));

        // equals(): true als beide arrays dezelfde elementen in dezelfde volgorde hebben.
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {2, 1, 3, 4, 5};
        int[] array4 = {1, 2, 3, 4};
        long[] array5 = {1, 2, 3, 4, 5};

        System.out.println("\nArray1 and array2 equal: " + Arrays.equals(array1, array2));
        System.out.println("Array1 and array3 equal: " + Arrays.equals(array1, array3));
        System.out.println("Array1 and array4 equal: " + Arrays.equals(array1, array4));
        //System.out.println("Array1 and array5 equal: " + Arrays.equals(array1, array5)); // compileert niet: int[] vs long[]

        // fill(): alle elementen (of een bereik) dezelfde waarde geven.
        int[] myArr1 = {20, 20, 10, 30, 20, 20, 40, 20};
        Arrays.fill(myArr1, 10);
        System.out.println("\n" + Arrays.toString(myArr1));

        // fill() met bereik: vanaf index 2 tot (exclusief) index 6.
        int[] myArr2 = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};
        Arrays.fill(myArr2, 2, 6, 1000);
        System.out.println(Arrays.toString(myArr2));

        // sort(): sorteert oplopend, eventueel enkel een deelbereik.
        int[] arrToSort = {10, -20, 33, 9, 97, -65, 345};
        System.out.println("\nThe original arrToSort:");
        for (int num : arrToSort) {
            System.out.print(num + " ");
        }

        // Enkel de indexen 0 tot en met 3 worden gesorteerd (eindindex 4 is exclusief).
        Arrays.sort(arrToSort, 0, 4);
        System.out.println("\nThe sorted arrToSort with a range from 0 to 4:");
        for (int num : arrToSort) {
            System.out.print(num + " ");
        }

        Arrays.sort(arrToSort);
        System.out.println("\nThe whole sorted arrToSort:");
        for (int num : arrToSort) {
            System.out.print(num + " ");
        }

        // binarySearch(): werkt ALLEEN correct op een gesorteerde array!
        int[] intArr = {300, 200, 100, 400, 500};
        int key = 300;

        System.out.println("\nBefore sorting: " + Arrays.toString(intArr));
        Arrays.sort(intArr); // eerst sorteren, anders is het resultaat onbetrouwbaar
        System.out.println("After sorting: " + Arrays.toString(intArr));
        System.out.println(key + " found at index " + Arrays.binarySearch(intArr, key));
    }
}
