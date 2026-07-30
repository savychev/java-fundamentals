package be.intecbrussel.extra;

/**
 * Extra: methoden en method overloading.
 * Een methode bundelt herbruikbare logica; overloading betekent dat meerdere
 * methoden dezelfde naam mogen hebben zolang hun parameterlijst verschilt.
 */
public class MethodenEnOverloading {

    /** Methode zonder resultaat (void): voert alleen iets uit. */
    static void groet(String naam) {
        System.out.println("Hallo, " + naam + "!");
    }

    /** Methode met een returnwaarde: geeft de som van twee ints terug. */
    static int som(int a, int b) {
        return a + b;
    }

    // Overload 1: zelfde naam, ander aantal parameters
    static int som(int a, int b, int c) {
        return a + b + c;
    }

    // Overload 2: zelfde naam, ander parametertype
    static double som(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        groet("Intec");

        // De compiler kiest de juiste overload op basis van de argumenten
        System.out.println(som(2, 3));        // int-versie      -> 5
        System.out.println(som(2, 3, 4));     // drie parameters -> 9
        System.out.println(som(2.5, 3.5));    // double-versie   -> 6.0
    }
}
