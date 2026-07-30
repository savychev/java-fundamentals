package be.intecbrussel.les2.finalTest;

/**
 * Demo van final variabelen: constanten, blanco finals en final in een for-each.
 */
public class FinalMainApp {
    public static void main(String[] args) {
        System.out.println(IntecBrussel.PI);               // static: via de klassenaam
        System.out.println(IntecBrussel.DAYS_OF_THE_WEEK);

        System.out.println();

        IntecBrussel obj = new IntecBrussel();
        System.out.println(obj.THRESHOLD);
        System.out.println(obj.CAPACITY);
        System.out.println(obj.MINIMUM);

        System.out.println();

        int[] arr = {1, 2, 3};
        // final in een for-each: de lusvariabele mag binnen de iteratie niet wijzigen
        for (final int number : arr) {
            System.out.println(number);
        }
    }
}
