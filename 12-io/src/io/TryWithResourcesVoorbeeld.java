package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 * Concept: try-with-resources.
 *
 * - Elke stream/reader/writer moet gesloten worden, anders lekken er
 *   systeembronnen (file handles).
 * - Vroeger deed men dat met een finally-blok vol null-checks — foutgevoelig.
 * - try-with-resources sluit alles AUTOMATISCH, ook als er een exception optreedt.
 *   Voorwaarde: de klasse implementeert AutoCloseable (alle IO-klassen doen dat).
 * - Meerdere resources scheid je met ';' — ze worden in OMGEKEERDE volgorde gesloten.
 */
public class TryWithResourcesVoorbeeld {
    public static void main(String[] args) {
        File bestand = new File(System.getProperty("java.io.tmpdir"), "twr-demo.txt");

        // Twee resources in een try-with-resources; geen enkele close() nodig
        try (FileWriter fw = new FileWriter(bestand);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("try-with-resources sluit mij automatisch.");

        } catch (IOException e) {
            System.err.println("Schrijven mislukt: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(bestand))) {
            System.out.println("Gelezen: " + br.readLine());
        } catch (IOException e) {
            System.err.println("Lezen mislukt: " + e.getMessage());
        }

        // Ter vergelijking: de OUDE stijl (niet meer gebruiken!)
        // FileReader fr = null;
        // try {
        //     fr = new FileReader(bestand);
        //     ...
        // } finally {
        //     if (fr != null) { try { fr.close(); } catch (IOException ignored) {} }
        // }

        bestand.delete(); // opruimen
    }
}
