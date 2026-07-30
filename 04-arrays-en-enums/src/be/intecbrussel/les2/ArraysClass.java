package be.intecbrussel.les2;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // toString()
        String strArr = Arrays.toString(myArr);
        System.out.println("Array: " + strArr);

        // copyOf()
        System.out.println("\n" + Arrays.toString(myArr));
        int[] newArr = Arrays.copyOf(myArr, 5);
        newArr[3] = 11;
        newArr[4] = 55;
        System.out.println(Arrays.toString(newArr));

        // equals()
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {2, 1, 3, 4, 5};
        int[] array4 = {1, 2, 3, 4};
        long[] array5 = {1, 2, 3, 4, 5};

        System.out.println("\nArray1 and array2 equal: " + Arrays.equals(array1, array2));
        System.out.println("Array1 and array3 equal: " + Arrays.equals(array1, array3));
        System.out.println("Array1 and array4 equal: " + Arrays.equals(array1, array4));
        //System.out.println("Array1 and array5 equal: " + Arrays.equals(array1, array5)); // error

        // fill()
        int[] myArr1 = {20, 20, 10, 30, 20, 20, 40, 20};
        Arrays.fill(myArr1, 10);
        System.out.println("\n" + Arrays.toString(myArr1));

        int[] myArr2 = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};
        Arrays.fill(myArr2, 2, 6, 1000);
        System.out.println(Arrays.toString(myArr2));

        // sort()
        int[] arrToSort = {10, -20, 33, 9, 97, -65, 345};
        System.out.println("\nThe original arrToSort:");
        for (int num : arrToSort) {
            System.out.print(num + " ");
        }

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

        // binarySearch()
        int[] intArr = {300, 200, 100, 400, 500};
        int key = 300;

        System.out.println("\nBefore sorting: " + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("After sorting: " + Arrays.toString(intArr));
        System.out.println(key + " found at index " + Arrays.binarySearch(intArr, key));
    }
}
