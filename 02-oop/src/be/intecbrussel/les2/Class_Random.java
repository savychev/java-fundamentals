package be.intecbrussel.les2;

import java.util.Random;

public class Class_Random {
    public static void main(String[] args) {
        Random random = new Random();

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        float randomFloat = random.nextFloat();
        System.out.println(randomFloat);

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        int randomIntBound = random.nextInt(50);
        System.out.println(randomIntBound);
    }
}
