package be.intecbrussel.test;

import java.util.Arrays;

public class IntegerArrayUtils {
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

    public static double getAverageIntArray(int[] arrayOfIntegers) {
        double sum = 0;
        double result = 0;

        for (int v : arrayOfIntegers) {
            sum += v;
        }

        result = sum / arrayOfIntegers.length;

        return result;
    }

    public static int getSumIntArray(int[] arrayOfIntegers) {
        int sum = 0;

        for (int v : arrayOfIntegers) {
            sum += v;
        }

        return sum;
    }

    public static int[] generateArrayWithIncrement(int increment) {
        int[] myArr = new int[10];
        int i = 0;

        while (i < myArr.length) {
            myArr[i] = i * increment;
            i++;
        }
        return myArr;
    }

    public static boolean isSorted(int[] arrayOfIntegers) {
        for (int i = 0; i < arrayOfIntegers.length - 1; i++) {
            if (arrayOfIntegers[i] > arrayOfIntegers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int[] arrToReverse) {
        System.out.println(Arrays.toString(arrToReverse));
        int lastIndex = arrToReverse.length - 1; // de laatste index
        for (int i = 0; i < arrToReverse.length / 2; i++) {
            int temp = arrToReverse[lastIndex];
            arrToReverse[lastIndex] = arrToReverse[i];
            arrToReverse[i] = temp;
            lastIndex--;

        }
        System.out.println(Arrays.toString(arrToReverse));
    }

    public static String[] getIntArrayData(int[] arrayOfIntegers) {
        String[] result = new String[4];
        int[] sorteredArray = sort(arrayOfIntegers, true); // override

        int min = sorteredArray[0];
        int max = sorteredArray[sorteredArray.length - 1];
        double avg = getAverageIntArray(arrayOfIntegers);
        int sum = getSumIntArray(arrayOfIntegers);

        result[0] = "The minimum value is: " + min;
        result[1] = "The maximum value is: " + max;
        result[2] = "The average value is: " + avg;
        result[3] = "The sum is: " + sum;

        return result;
    }

    public static int[] findDublicates(int[] firstArray, int[] secondArray) {

        int len = 0;
        int i = 0;
        int[] tempArray = new int[10];

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

        int[] result = new int[len * 2];

        int ii = 0;
        while (ii < result.length) {
            result[ii] = tempArray[ii];
            ii++;
        }

        return result;
    }
}
