package be.intecbrussel.les1;

/**
 * Kort testje: een String omzetten naar een char-array met toCharArray().
 */
public class Test {
    public static void main(String[] args) {
        String str = "From String to a char array";
        char[] charArray = str.toCharArray(); // elke letter wordt een element

        for (char ch : charArray) {
            System.out.print(ch + " | ");
        }
    }
}
