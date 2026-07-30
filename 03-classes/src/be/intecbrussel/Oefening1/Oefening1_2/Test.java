package be.intecbrussel.Oefening1.Oefening1_2;

/**
 * Experiment: geheel delen door nul compileert WEL, maar gooit tijdens
 * de uitvoering een ArithmeticException ("/ by zero").
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(223 / 0); // ArithmeticException at runtime
    }
}
