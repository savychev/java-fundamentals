package be.intecbrussel.les1.Oefening4;

/**
 * Oefening 4.1 - Math.max() met gemengde types.
 * float wordt automatisch verbreed naar double (widening).
 */
public class Oefening4_1 {
    public static void main(String[] args) {
        double num1 = 11;
        float num2 = 9.0F;

        System.out.println(Math.max(num1, num2)); // 11.0
    }
}
