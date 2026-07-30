package be.intecbrussel.les2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Period: een tijdsduur in jaren, maanden en dagen (datum-gebaseerd).
 * Vergelijk met Duration, dat op uren/minuten/seconden werkt.
 */
public class Class_Period {
    public static void main(String[] args) {
        Period tenDays = Period.ofDays(10);
        System.out.println(tenDays.getDays()); // 10

        LocalDate oldDate = LocalDate.of(1991, Month.JULY, 2);
        LocalDate newDate = LocalDate.of(2025, Month.JULY, 1);

        // between() splitst het verschil op in jaren + maanden + dagen
        Period period = Period.between(oldDate, newDate);

        System.out.println(period.getYears() + " years");
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");
    }
}
