package be.intecbrussel.les2;

/**
 * String.split(): een String opdelen in een String-array
 * op basis van een scheidingsteken (hier: een spatie).
 */
public class SplitExample {
    public static void main(String[] args) {
        String myStr = "Java is the best!";

        // Elk woord wordt een element van de array.
        String[] strArray = myStr.split(" ");

        System.out.println("String: " + myStr);

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Index: " + i + " value of element: " + strArray[i]);
        }
    }
}
