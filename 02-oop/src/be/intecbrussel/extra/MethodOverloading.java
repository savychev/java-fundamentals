package be.intecbrussel.extra;

/**
 * Method overloading: meerdere methodes met DEZELFDE naam maar een
 * verschillende parameterlijst (aantal en/of type).
 * De compiler kiest de juiste versie op basis van de argumenten.
 */
public class MethodOverloading {

    // zelfde naam, ander aantal parameters
    static int optellen(int a, int b) {
        return a + b;
    }

    static int optellen(int a, int b, int c) {
        return a + b + c;
    }

    // zelfde naam, ander type parameters
    static double optellen(double a, double b) {
        return a + b;
    }

    static String optellen(String a, String b) {
        return a + b; // bij Strings betekent + aaneenschakelen
    }

    public static void main(String[] args) {
        System.out.println(optellen(1, 2));            // int-versie -> 3
        System.out.println(optellen(1, 2, 3));         // drie parameters -> 6
        System.out.println(optellen(1.5, 2.5));        // double-versie -> 4.0
        System.out.println(optellen("Hello ", "Java")); // String-versie

        // let op: het retourtype alleen is NIET genoeg om te overloaden
    }
}
