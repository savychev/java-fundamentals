package be.intecbrussel.Oefening1.Oefening1_3;

/**
 * Oefening 1.3 - eenvoudige rekenmachine: een klasse met een veld
 * en vijf instantiemethodes voor de basisbewerkingen.
 */
public class Calculator {
    double result;

    public double addition(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    public double subtraction(double num1, double num2) {
        result = num1 - num2;
        return result;
    }

    public double multiplication(double num1, double num2) {
        result = num1 * num2;
        return result;
    }

    public double division(double num1, double num2) {
        // delen door 0.0 met doubles geeft Infinity, geen exception
        result = num1 / num2;
        return result;
    }

    public double modulus(double num1, double num2) {
        result = num1 % num2;
        return result;
    }
}
