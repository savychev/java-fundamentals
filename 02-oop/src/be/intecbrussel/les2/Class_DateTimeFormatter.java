package be.intecbrussel.les2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter: een datum/tijd omzetten naar een leesbare String
 * met een zelfgekozen patroon.
 */
public class Class_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before formatting: " + now); // ISO-formaat (standaard)

        // dd = dag, MM = maand, yyyy = jaar, HH = uur (24u), mm = minuten, ss = seconden
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After formatting: " + formatDateTime);
    }
}
