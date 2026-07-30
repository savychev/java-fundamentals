package be.intecbrussel.les1;

/**
 * Valkuil-demo: StringBuilder.reverse() wijzigt het ORIGINELE object.
 * Na reverse() is "word" zelf dus ook omgekeerd.
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("adam");

        System.out.println(word); // adam

        // reverse() geeft dezelfde (gewijzigde) builder terug
        StringBuilder wordReverse = new StringBuilder(word.reverse());

        System.out.println(word);        // mada - het origineel is mee veranderd!
        System.out.println(wordReverse); // mada
    }
}
