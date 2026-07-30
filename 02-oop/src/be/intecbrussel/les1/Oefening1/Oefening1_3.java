package be.intecbrussel.les1.Oefening1;

/**
 * Oefening 1.3 - charAt() + Character.
 * Maak van "hello world" de waarde "HeLlO WoRlD":
 * even index -> hoofdletter, oneven index -> kleine letter.
 */
public class Oefening1_3 {
    public static void main(String[] args) {
        String str = "hello world";
        char symbol;
        String result = "";

        int length = str.length();

        for (int i = 0; i < length; i++) {
            symbol = str.charAt(i);
            if (i % 2 == 0) {
                result += Character.toUpperCase(symbol); // even positie -> hoofdletter
            } else {
                result += Character.toLowerCase(symbol); // oneven positie -> kleine letter
            }
        }
        System.out.println(result);
    }
}
