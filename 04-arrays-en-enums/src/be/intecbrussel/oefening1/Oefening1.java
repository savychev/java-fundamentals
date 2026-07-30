package be.intecbrussel.oefening1;

/**
 * Oefening: arrays declareren en een element uitlezen via zijn index.
 */
public class Oefening1 {
    public static void main(String[] args) {
        double[] arrayOfDouble = new double[3]; // elementen starten op 0.0
        arrayOfDouble[0] = 10.0;
        System.out.println(arrayOfDouble[0]);

        char[] arrayOfChars = {'a', 'b', 'c'};
        System.out.println(arrayOfChars[1]); // b (index 1 = tweede element)
    }
}
