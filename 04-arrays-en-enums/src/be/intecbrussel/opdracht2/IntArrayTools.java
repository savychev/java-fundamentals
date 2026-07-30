package be.intecbrussel.opdracht2;


public class IntArrayTools {
    public static boolean isSorted(int[] arr, boolean ascending) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (ascending) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] sort(int[] array, boolean ascending) {
        int[] arr = array.clone();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static boolean chopSearch(int[] array, int value) {
        int[] arr = array.clone();
        for (int a : arr) {
            if (a == value) {
                return true;
            }
        }
        return false;
    }
}