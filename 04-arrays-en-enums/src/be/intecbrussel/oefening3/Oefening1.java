package be.intecbrussel.oefening3;

/**
 * Oefening: een char-array afdrukken met index en waarde per element.
 */
public class Oefening1 {
    public static void main(String[] args) {
        String str = "Char Array!";

        char[] charArray = str.toCharArray();

        // Klassieke for-lus, want we hebben hier ook de index nodig.
        for (int i = 0; i < charArray.length; i++) {
            System.out.print("|" + i + "=" + charArray[i]);
        }
        System.out.print("|");
    }
}
