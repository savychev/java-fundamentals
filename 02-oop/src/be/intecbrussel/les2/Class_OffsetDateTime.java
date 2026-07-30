package be.intecbrussel.les2;

import java.time.*;

/**
 * OffsetDateTime: datum + tijd + verschuiving t.o.v. UTC (bv. +02:00).
 * Handig voor communicatie met databanken en API-koppelingen.
 */
public class Class_OffsetDateTime {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime); // bv. 2025-07-22T14:30:15.123+02:00
    }
}
