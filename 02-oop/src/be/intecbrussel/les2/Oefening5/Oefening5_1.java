package be.intecbrussel.les2.Oefening5;

import java.util.Random;


public class Oefening5_1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(1, 100);
            System.out.println(num);
        }


    }
}
