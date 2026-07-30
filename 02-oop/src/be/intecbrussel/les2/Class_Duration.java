package be.intecbrussel.les2;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Duration: een tijdsduur op basis van tijd (uren, minuten, seconden).
 * Vergelijk met Period, dat op datums (jaren/maanden/dagen) werkt.
 */
public class Class_Duration {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oldDate = LocalDateTime.of(2016, 8, 31, 10, 20, 55);

        // een vaste duur van 1 uur, uitgedrukt in seconden
        Duration oneHour = Duration.ofHours(1);
        System.out.println(oneHour.getSeconds() + " seconds"); // 3600 seconds

        // het verschil tussen twee momenten
        Duration duration = Duration.between(oldDate, now);
        System.out.println(duration.getSeconds() + " seconds");
    }
}
