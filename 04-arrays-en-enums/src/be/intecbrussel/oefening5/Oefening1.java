package be.intecbrussel.oefening5;

import java.util.Arrays;

/**
 * Oefening: een driedimensionale array en Arrays.deepToString(),
 * dat ook geneste arrays leesbaar afdrukt (toString() doet dat niet).
 */
public class Oefening1 {
    public static void main(String[] args) {

        int[][][] myArr = new int[5][5][5]; // 5 x 5 x 5 elementen, allemaal 0
        System.out.println(Arrays.deepToString(myArr));
    }
}
