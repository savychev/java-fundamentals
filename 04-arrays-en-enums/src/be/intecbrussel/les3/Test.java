package be.intecbrussel.les3;

import be.intecbrussel.les3.color.Color;

/**
 * Kleine test: enum-constanten vergelijken en hun naam/positie opvragen.
 */
public class Test {
    public static void main(String[] args) {
        Color kleur = Color.valueOf("RED"); // String -> enum-constante (hoofdlettergevoelig!)

        System.out.println(kleur == Color.RED); // true: enums mag je veilig met == vergelijken
        System.out.println(kleur.name());       // "RED": de naam van de constante
        System.out.println(kleur.ordinal());    // 0: de positie in de declaratievolgorde
    }
}
