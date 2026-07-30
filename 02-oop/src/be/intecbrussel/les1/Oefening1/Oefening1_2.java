package be.intecbrussel.les1.Oefening1;

// Maak een string met volgende waarde "walter, edwin, mike" controleer of de naam edwin voorkomt in de string.
public class Oefening1_2 {
    public static void main(String[] args) {
        String str = "walter, edwin, mike";
        String subStr = "edwin";

        String result = str.contains(subStr) ? "The string contains " + subStr : "The string doesn't contain " + subStr;

        System.out.println(result);
    }
}
