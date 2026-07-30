package be.intecbrussel.les2.Oefening5;

import java.util.Random;

/**
 * Oefening 5.1 - vijf willekeurige getallen tussen 1 en 100 afdrukken.
 */
public class Oefening5_1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            // nextInt(origin, bound): 1 inclusief, 100 exclusief
            int num = random.nextInt(1, 100);
            System.out.println(num);
        }
    }
}
