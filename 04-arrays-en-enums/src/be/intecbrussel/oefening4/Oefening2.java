package be.intecbrussel.oefening4;

import java.util.Arrays;

/**
 * Oefening: copyOf() met een grotere lengte dan het origineel.
 * De extra posities worden opgevuld met de defaultwaarde 0.
 */
public class Oefening2 {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        int[] newArr = Arrays.copyOf(myArr, 10); // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));
    }
}
