package be.intecbrussel.les2;


import java.time.*;

public class Class_LocalDateTime {
    public static void main(String[] args) {
        LocalDate DateNow = LocalDate.now();
        LocalTime TimeNow = LocalTime.now();
        LocalDateTime DateTimeNow = LocalDateTime.now();

        System.out.println(DateNow);
        System.out.println(TimeNow);
        System.out.println(DateTimeNow);

        System.out.println("-");

        System.out.println("Now: " + LocalDateTime.now());
        System.out.println("Apr 15, 1994, 11:30am: " + LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
        System.out.println("Now (from instant): " + LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
        System.out.println("6 months from now: " + LocalDateTime.now().plusMonths(6));
        System.out.println("6 months ago: " + LocalDateTime.now().minusMonths(6));
    }
}
