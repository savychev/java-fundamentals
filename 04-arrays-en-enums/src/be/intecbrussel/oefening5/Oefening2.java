package be.intecbrussel.oefening5;

import java.util.Arrays;

/**
 * Oefening: met een for-each over de rijen van een 2D-array lopen.
 * Elke rij is zelf een int[] die we met Arrays.toString() afdrukken.
 */
public class Oefening2 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        for (int[] r : numbers) { // r = een volledige rij
            System.out.println(Arrays.toString(r));
        }
    }
}
