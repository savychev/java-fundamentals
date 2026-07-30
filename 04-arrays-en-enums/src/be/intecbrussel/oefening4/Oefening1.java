package be.intecbrussel.oefening4;

import java.util.Arrays;
import java.util.Collections;

public class Oefening1 {
    public static void main(String[] args) {
        Double[] arrDouble = {
                3.14, 2.718, 1.618, 0.577, 1.414,
                9.81, 6.022e23, 299792458.0, 1.0, 0.0,
                -273.15, 42.0, 7.77, 123.456, 9876.54321
        };

        String[] arrStr = {
                "appel", "boom", "fiets", "straat", "auto",
                "huis", "computer", "boek", "tafel", "stoel",
                "zon", "maan", "ster", "water", "vuur"
        };

        Arrays.sort(arrDouble);
        System.out.println(Arrays.toString(arrDouble));
        Arrays.sort(arrDouble, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrDouble));

        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));
        Arrays.sort(arrStr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrStr));
    }
}
