package be.intecbrussel.les1;

/**
 * Basisvoorbeeld van arrays: declareren, initialiseren, een element
 * aanpassen en op drie manieren itereren (for, for-each en while).
 */
public class ArrayVoorbeeld {
    public static void main(String[] args) {
        // Declaratie met vaste lengte: alle elementen krijgen de defaultwaarde 0.
        int[] myFirstArray = new int[10];

        // Declaratie met initialisatie: de lengte volgt uit het aantal waarden.
        int[] mySecondArray = {10, 20, 30, 40, 50};

        System.out.println("Voor de aanpassing: " + mySecondArray[0] + "\n");

        // Een element aanpassen via zijn index (indexen beginnen bij 0).
        mySecondArray[0] = 10000;

        System.out.println("Na de aanpassing: " + mySecondArray[0] + "\n");

        // length is een veld (geen methode!) met het aantal elementen.
        System.out.println("The length of mySecondArray is: " + mySecondArray.length);

        // Klassieke for-lus: handig wanneer je de index nodig hebt.
        for (int i = 0; i < mySecondArray.length; i++) {
            System.out.println("This is mySecondArray and the index is: " + i + " with the value of " + mySecondArray[i]);
        }

        System.out.println("\n");

        // For-each (enhanced for): leest elk element, zonder index.
        for (int value : mySecondArray) {
            System.out.println("This is a for each loop: " + value);
        }

        System.out.println("\n");

        int[] numbersArr = {2, 4, 6, 8, 10};

        int i = 0;

        // While-lus: zelf de teller beheren en verhogen.
        while (i < numbersArr.length) {
            System.out.println("This iteration is done by While loop: " + numbersArr[i]);
            i++;
        }
    }
}
