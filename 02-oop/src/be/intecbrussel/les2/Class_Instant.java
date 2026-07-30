package be.intecbrussel.les2;

import java.time.Instant;

/**
 * Instant: een machineleesbaar tijdstip op de UTC-tijdlijn,
 * geteld vanaf de epoch (1 januari 1970, 00:00:00 UTC).
 */
public class Class_Instant {
    public static void main(String[] args) {

        // now() - huidig moment in UTC
        Instant dateAndTime = Instant.now();
        System.out.println(dateAndTime);

        // EPOCH-constante - het nulpunt van de tijdlijn
        Instant epochDate = Instant.EPOCH;
        System.out.println(epochDate); // 1970-01-01T00:00:00Z
    }
}
