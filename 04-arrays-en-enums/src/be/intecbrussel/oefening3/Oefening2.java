package be.intecbrussel.oefening3;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {
        String[] firstArray = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst!"};

        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                String temp = firstArray[i];
                firstArray[i] = secondArray[i];
                secondArray[i] = temp;
            }
            System.out.println(Arrays.toString(firstArray)); // [C#, is, the, worst!]
            System.out.println(Arrays.toString(secondArray)); // [Intec, is, the, best!]
        } else {
            System.out.println("Error! De arrays zijn niet gelijk van lengte.");
        }
    }
}
