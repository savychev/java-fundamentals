package be.intecbrussel.les2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Class_Period {
    public static void main(String[] args) {
        Period tenDays = Period.ofDays(10);
        System.out.println(tenDays.getDays());

        LocalDate oldDate = LocalDate.of(1991, Month.JULY, 2);
        LocalDate newDate = LocalDate.of(2025, Month.JULY, 1);

        Period period = Period.between(oldDate, newDate);

        System.out.println(period.getYears() + " years");
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");
    }
}