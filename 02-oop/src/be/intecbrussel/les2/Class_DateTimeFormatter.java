package be.intecbrussel.les2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Class_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before formatting: " + now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After formatting: " + formatDateTime);
    }
}
