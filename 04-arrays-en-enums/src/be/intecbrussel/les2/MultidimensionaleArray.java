package be.intecbrussel.les2;

import java.util.Arrays;

public class MultidimensionaleArray {
    public static void main(String[] args) {
        int[][] myArr = new int[2][5];

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

        for (int i = 0; i < myArr.length; i++) {
            for (int n = 0; n < myArr[i].length; n++) {
                System.out.println(myArr[i][n]);
            }
        }
    }
}