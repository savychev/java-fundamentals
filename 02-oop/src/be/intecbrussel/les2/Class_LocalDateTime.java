package be.intecbrussel.les2;

import java.time.*;

/**
 * LocalDate, LocalTime en LocalDateTime: datum en tijd ZONDER tijdzone.
 * Aanmaken met now(), of(), ofInstant() en rekenen met plus.../minus...
 */
public class Class_LocalDateTime {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();             // enkel datum
        LocalTime timeNow = LocalTime.now();             // enkel tijd
        LocalDateTime dateTimeNow = LocalDateTime.now(); // datum + tijd

        System.out.println(dateNow);
        System.out.println(timeNow);
        System.out.println(dateTimeNow);

        System.out.println("-");

        System.out.println("Now: " + LocalDateTime.now());
        // of() - een specifiek moment opbouwen
        System.out.println("Apr 15, 1994, 11:30am: " + LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
        // ofInstant() - een Instant omzetten naar lokale tijd
        System.out.println("Now (from instant): " + LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
        // plusMonths()/minusMonths() geven een NIEUW object terug (immutable!)
        System.out.println("6 months from now: " + LocalDateTime.now().plusMonths(6));
        System.out.println("6 months ago: " + LocalDateTime.now().minusMonths(6));
    }
}
