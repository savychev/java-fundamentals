package be.intecbrussel.opdracht2;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 2};

        System.out.println(IntArrayTools.isSorted(nums, false));
        System.out.println(Arrays.toString(IntArrayTools.sort(nums, true)));
        System.out.println(IntArrayTools.chopSearch(nums, 9));
    }
}
