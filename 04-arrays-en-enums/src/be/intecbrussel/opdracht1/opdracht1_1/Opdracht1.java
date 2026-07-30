package be.intecbrussel.opdracht1.opdracht1_1;

import java.util.Arrays;

public class Opdracht1 {
    public static void main(String[] args) {
        int[] studentPoints = {1, 5, 6, -9, 77, 110, -4, 3, 10, 2};
        int[] newStudentPoints = new int[10];

        int i = 0;
        for (int point : studentPoints) {
            point = point > 10 ? point / 11 : point;
            point = point < 0 ? Math.abs(point) : point;
            point = point > 0 && point < 3 ? point * 3 : point;
            newStudentPoints[i] = point;
            i++;
        }

        System.out.println(Arrays.toString(newStudentPoints));
    }
}