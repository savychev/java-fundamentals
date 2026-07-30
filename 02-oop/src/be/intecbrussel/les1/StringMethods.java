package be.intecbrussel.les1;

/**
 * Veelgebruikte methodes van de klasse String.
 * Let op: String is immutable - elke methode geeft een NIEUWE String terug,
 * het origineel verandert nooit.
 */
public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!";
        String strBlank = "";

        // toUpperCase() / toLowerCase()
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // length() - aantal karakters
        System.out.println(str.length());

        // isBlank() - true bij lege string of enkel witruimte
        System.out.println(strBlank.isBlank());

        // replace() - vervangt alle voorkomens van een karakter
        System.out.println(str.replace('w', 'W'));

        // strip() - verwijdert witruimte vooraan en achteraan
        String strToStrip = "   hello world!   ";
        System.out.println(strToStrip);
        System.out.println(strToStrip.strip());
        System.out.println(strToStrip.stripLeading());  // enkel vooraan
        System.out.println(strToStrip.stripTrailing()); // enkel achteraan

        // indexOf() - positie van het eerste voorkomen (-1 indien niet gevonden)
        System.out.println(str.indexOf("world"));

        // contains() - bevat de string de deelstring?
        System.out.println(str.contains("world"));

        // substring() - deel van de string: beginindex inclusief, eindindex exclusief
        System.out.println(str.substring(6, 11));
    }
}
