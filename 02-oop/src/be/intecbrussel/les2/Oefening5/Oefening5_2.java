package be.intecbrussel.les2.Oefening5;

import java.util.Random;


public class Oefening5_2 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(45);
            System.out.println(num);
        }
    }
}
