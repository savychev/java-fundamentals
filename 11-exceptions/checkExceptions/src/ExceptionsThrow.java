/**
 * Demo: verschil tussen 'throw' en 'throws'.
 * - throw  = een exception-object daadwerkelijk gooien (statement).
 * - throws = in de methodesignatuur aankondigen dat de methode een
 *            (checked) exception kan doorgeven aan de aanroeper.
 */
public class ExceptionsThrow {

    public static void main(String[] args) {
        try {
            controleerLeeftijd(15); // gooit een exception
        } catch (IllegalArgumentException e) {
            System.out.println("Gevangen: " + e.getMessage());
        }
        controleerLeeftijd(21);
        System.out.println("21 is oke.");
    }

    // Unchecked exceptions hoeven niet in 'throws' te staan, maar het
    // documenteren mag wel.
    static void controleerLeeftijd(int leeftijd) throws IllegalArgumentException {
        if (leeftijd < 18) {
            // 'throw' gooit het exception-object; de methode stopt hier direct.
            throw new IllegalArgumentException("Leeftijd moet minstens 18 zijn, was " + leeftijd);
        }
    }
}
