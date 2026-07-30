package be.intecbrussel.les1.Oefening4;

/**
 * Oefening 4.2 - Math.pow(): grondtal tot een macht verheffen.
 */
public class Oefening4_2 {
    public static void main(String[] args) {
        int i = 5; // grondtal
        int t = 4; // exponent
        double result;

        result = Math.pow(i, t); // 5^4 = 625.0 (pow geeft altijd double terug)

        System.out.println(result);
    }
}
