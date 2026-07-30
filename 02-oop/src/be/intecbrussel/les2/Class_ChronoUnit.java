package be.intecbrussel.les2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * ChronoUnit.between(): het verschil tussen twee datums/tijden
 * uitgedrukt in EEN gekozen eenheid (jaren, dagen, seconden, ...).
 */
public class Class_ChronoUnit {
    public static void main(String[] args) {
        LocalDateTime oldDate = LocalDateTime.of(1991, 7, 2, 0, 45, 0);
        LocalDateTime newDate = LocalDateTime.of(2025, 7, 22, 0, 0, 0);

        // elk resultaat is het VOLLEDIGE verschil in die eenheid
        long years = ChronoUnit.YEARS.between(oldDate, newDate);
        long months = ChronoUnit.MONTHS.between(oldDate, newDate);
        long weeks = ChronoUnit.WEEKS.between(oldDate, newDate);
        long days = ChronoUnit.DAYS.between(oldDate, newDate);
        long hours = ChronoUnit.HOURS.between(oldDate, newDate);
        long minutes = ChronoUnit.MINUTES.between(oldDate, newDate);
        long seconds = ChronoUnit.SECONDS.between(oldDate, newDate);
        long millis = ChronoUnit.MILLIS.between(oldDate, newDate);
        long nanos = ChronoUnit.NANOS.between(oldDate, newDate);
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(weeks + " weeks");
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
        System.out.println(millis + " millis");
        System.out.println(nanos + " nanos");
    }
}
