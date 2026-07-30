package be.intecbrussel.oefening3;

import java.util.Arrays;

/**
 * Oefening: de inhoud van twee arrays element per element omwisselen (swap),
 * met een tijdelijke variabele als tussenstap.
 */
public class Oefening2 {
    public static void main(String[] args) {
        String[] firstArray = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst!"};

        // Wisselen kan alleen veilig als beide arrays even lang zijn.
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                String temp = firstArray[i]; // waarde even opzijzetten
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
