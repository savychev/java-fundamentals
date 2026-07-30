package be.intecbrussel.les1.multiplier;

/**
 * Method overloading: zelfde naam, verschillende parameterlijsten.
 * De compiler kiest de juiste variant op basis van de argumenten.
 */
public class Multiplier {
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public int multiplyNumbers(int a, int b, int c) { // overload met drie parameters
        return a * b * c;
    }
}
