package be.intecbrussel.Oefening1.Oefening1_3;

/**
 * Demo bij Calculator: elke bewerking een keer aanroepen.
 */
public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(3, 7));        // 10.0
        System.out.println(calculator.subtraction(100, 3));   // 97.0
        System.out.println(calculator.multiplication(3, 8));  // 24.0
        System.out.println(calculator.division(100, 4));      // 25.0
        System.out.println(calculator.modulus(100, 3));       // 1.0
    }
}
