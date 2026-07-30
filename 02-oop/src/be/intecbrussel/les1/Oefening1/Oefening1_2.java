package be.intecbrussel.les1.Oefening1;

/**
 * Oefening 1.2 - contains().
 * Maak een String "walter, edwin, mike" en controleer of de naam
 * "edwin" erin voorkomt.
 */
public class Oefening1_2 {
    public static void main(String[] args) {
        String str = "walter, edwin, mike";
        String subStr = "edwin";

        // ternary operator: voorwaarde ? waarde-als-true : waarde-als-false
        String result = str.contains(subStr) ? "The string contains " + subStr : "The string doesn't contain " + subStr;

        System.out.println(result);
    }
}
