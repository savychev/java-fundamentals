package be.intecbrussel.opdracht2;

import java.util.Arrays;

/**
 * Demo van de hulpklasse IntArrayTools: isSorted(), sort() en chopSearch().
 */
public class ArrayApp {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 2};

        System.out.println(IntArrayTools.isSorted(nums, false));             // false: niet aflopend gesorteerd
        System.out.println(Arrays.toString(IntArrayTools.sort(nums, true))); // [1, 2, 3, 5, 8]
        System.out.println(IntArrayTools.chopSearch(nums, 9));               // false: 9 zit niet in de array
    }
}
