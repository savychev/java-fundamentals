package be.intecbrussel;

/** Les 1: int-variabelen declareren, initialiseren en optellen; output met println en +. */
public class Les1 {
    public static void main(String[] args) {
        int a = 10;
        int b = -20; // int kan ook negatief zijn
        int c = a + b;

        // Met + plak je tekst en waarden aan elkaar (String-concatenatie)
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The sum of a and b is " + c);
    }
}
