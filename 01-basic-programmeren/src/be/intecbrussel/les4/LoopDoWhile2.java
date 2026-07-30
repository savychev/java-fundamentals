package be.intecbrussel.les4;

/**
 * Les 4: het verschil met while — een do-while draait ALTIJD minstens één keer,
 * ook al is de voorwaarde (i < 6) hier vanaf het begin onwaar.
 */
public class LoopDoWhile2 {
    public static void main(String[] args) {
        int i = 10; // voorwaarde is meteen onwaar, toch één keer output
        do {
            System.out.println("Hello world!");
            i++;
        }
        while (i < 6);
    }
}
