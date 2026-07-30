package be.intecbrussel.les2;

import java.time.Instant;

public class Class_Instant {
    public static void main(String[] args) {

        // now()
        Instant dateAndTime = Instant.now();
        System.out.println(dateAndTime);

        // EPOCH constant
        Instant epochDate = Instant.EPOCH;
        System.out.println(epochDate);
    }
}
