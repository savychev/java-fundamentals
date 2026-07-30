package be.intecbrussel.les2.Oefening7;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Oefening 7.3 - leeftijd berekenen met Period.between():
 * het verschil tussen geboortedatum en vandaag in jaren, maanden en dagen.
 */
public class Oefening7_3 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate myBirthDay = LocalDate.of(1991, Month.JULY, 2);

        Period period = Period.between(myBirthDay, now);

        System.out.println("I was born");
        System.out.println(period.getYears() + " years and");
        System.out.println(period.getMonths() + " months and");
        System.out.println(period.getDays() + " days");
        System.out.println("ago.");
    }
}
