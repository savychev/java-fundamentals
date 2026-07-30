package be.intecbrussel.les1;

/**
 * Veelgebruikte methodes van StringBuilder.
 * In tegenstelling tot String is StringBuilder mutable:
 * de methodes wijzigen het object zelf.
 */
public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world!");
        System.out.println(str);

        // append() - voegt tekst toe aan het einde
        StringBuilder str1 = new StringBuilder("Hello");
        str1.append(" world!");
        System.out.println(str1);

        // insert() - voegt tekst toe op een bepaalde index
        StringBuilder str2 = new StringBuilder("walter, mike");
        str2.insert(6, ", edwin");
        System.out.println(str2);

        // toString() - zet de StringBuilder om naar een gewone String
        StringBuilder str3 = new StringBuilder("Hello world! This is a string.");
        String txt = str3.toString();
        System.out.println(txt);

        // reverse() - keert de inhoud om (wijzigt het object zelf!)
        StringBuilder str4 = new StringBuilder("Hello world!");
        System.out.println(str4.reverse());
    }
}
