package be.intecbrussel.les2.Oefening7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oefening7_2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Now: " + now);

        String formatDateTime = now.format(format);
        System.out.println("Now (a little prettier): " + formatDateTime);
    }
}
