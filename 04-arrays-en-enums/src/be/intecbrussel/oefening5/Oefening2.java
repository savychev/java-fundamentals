package be.intecbrussel.oefening5;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        for (int[] r : numbers) {
            System.out.println(Arrays.toString(r));
        }
    }
}