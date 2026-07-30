package be.intecbrussel.oefening4;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        int[] newArr = Arrays.copyOf(myArr, 10);
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));
    }
}
