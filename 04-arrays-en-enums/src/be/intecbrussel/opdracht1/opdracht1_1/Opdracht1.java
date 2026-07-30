package be.intecbrussel.opdracht1.opdracht1_1;

import java.util.Arrays;

/**
 * Opdracht: studentenpunten normaliseren naar een schaal van 0 tot 10
 * met de ternaire operator (voorwaarde ? waardeAlsWaar : waardeAlsOnwaar).
 */
public class Opdracht1 {
    public static void main(String[] args) {
        int[] studentPoints = {1, 5, 6, -9, 77, 110, -4, 3, 10, 2};
        int[] newStudentPoints = new int[10];

        int i = 0;
        for (int point : studentPoints) {
            point = point > 10 ? point / 11 : point;              // te hoge scores terugschalen
            point = point < 0 ? Math.abs(point) : point;          // negatieve scores positief maken
            point = point > 0 && point < 3 ? point * 3 : point;   // heel lage scores ophogen
            newStudentPoints[i] = point;
            i++;
        }

        System.out.println(Arrays.toString(newStudentPoints));
    }
}
