package be.intecbrussel.les2.Oefening8;

/**
 * Oefening 8.2 - via de wrapper Float een float omzetten naar String
 * en de lengte van die String bepalen.
 */
public class Oefening8_2 {
    public static void main(String[] args) {
        float num = 468.556F;
        Float numObj = num;                 // autoboxing
        String numStr = numObj.toString();  // "468.556"
        int lengthOfString = numStr.length();

        System.out.println(lengthOfString); // 7
    }
}
