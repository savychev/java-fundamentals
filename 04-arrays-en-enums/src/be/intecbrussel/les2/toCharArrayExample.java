package be.intecbrussel.les2;

/**
 * String.toCharArray(): een String omzetten naar een char-array,
 * zodat je letter per letter kunt itereren.
 */
public class ToCharArrayExample {
    public static void main(String[] args) {
        String str = "From String to a char array";
        char[] charArr = str.toCharArray(); // elke letter wordt een element

        for (char ch : charArr) {
            System.out.print(ch + "|");
        }
    }
}
