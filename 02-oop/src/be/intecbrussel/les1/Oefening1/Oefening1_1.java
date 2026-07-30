package be.intecbrussel.les1.Oefening1;

/**
 * Oefening 1.1 - substring().
 * Ken de waarde "Java Exercises!" toe aan een String en druk enkel
 * het woord "Exercises" af met een methode van de String-klasse.
 */
public class Oefening1_1 {
    public static void main(String[] args) {
        String str = "Java Exercises!";

        // beginindex 5 (inclusief), eindindex 14 (exclusief)
        System.out.println(str.substring(5, 14));
    }
}
