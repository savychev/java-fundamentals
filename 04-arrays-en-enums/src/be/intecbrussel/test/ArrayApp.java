package be.intecbrussel.test;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] testArray = {9, 6, 7, 1, 5, 3};
        int[] testArray2 = {2, 5, 3, 9, 4, 3};


        System.out.println(Arrays.toString(IntegerArrayUtils.generateArrayWithIncrement(5)));
        System.out.println(IntegerArrayUtils.isSorted(testArray));
        IntegerArrayUtils.reverseArray(testArray);
        System.out.println(Arrays.toString(IntegerArrayUtils.getIntArrayData(testArray)));
        System.out.println(Arrays.toString(IntegerArrayUtils.findDublicates(testArray, testArray2)));
    }
}
