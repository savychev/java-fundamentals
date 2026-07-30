package be.intecbrussel.les2;

import java.util.Random;

/**
 * De klasse Random: willekeurige waarden van verschillende types genereren.
 */
public class Class_Random {
    public static void main(String[] args) {
        Random random = new Random();

        boolean randomBoolean = random.nextBoolean(); // true of false
        System.out.println(randomBoolean);

        double randomDouble = random.nextDouble(); // [0.0, 1.0)
        System.out.println(randomDouble);

        float randomFloat = random.nextFloat(); // [0.0, 1.0)
        System.out.println(randomFloat);

        int randomInt = random.nextInt(); // volledig int-bereik, ook negatief
        System.out.println(randomInt);

        int randomIntBound = random.nextInt(50); // 0 tot en met 49 (bovengrens exclusief)
        System.out.println(randomIntBound);
    }
}
