package be.intecbrussel.les2;

/**
 * Tweedimensionale array: een tabel met rijen en kolommen.
 * new int[2][5] betekent 2 rijen van elk 5 kolommen.
 */
public class MultidimensionaleArray {
    public static void main(String[] args) {
        int[][] myArr = new int[2][5];

        // Vullen: eerste index = rij, tweede index = kolom.
        myArr[0][0] = 1;
        myArr[0][1] = 2;
        myArr[0][2] = 3;
        myArr[0][3] = 4;
        myArr[0][4] = 5;
        myArr[1][0] = 10;
        myArr[1][1] = 20;
        myArr[1][2] = 30;
        myArr[1][3] = 40;
        myArr[1][4] = 50;

        // Geneste lussen: de buitenste loopt over de rijen,
        // de binnenste over de kolommen van die rij.
        for (int i = 0; i < myArr.length; i++) {
            for (int n = 0; n < myArr[i].length; n++) {
                System.out.println(myArr[i][n]);
            }
        }
    }
}
