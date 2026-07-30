package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Concept: BufferedWriter en BufferedReader.
 *
 * - Een buffer verzamelt data in het geheugen en schrijft/leest in grote blokken.
 *   Dat is veel sneller dan elk karakter apart naar de schijf sturen.
 * - Extra's: newLine() (platform-onafhankelijke regelovergang)
 *   en readLine() (leest een hele regel, geeft null bij einde bestand).
 */
public class BufferedReaderWriterVoorbeeld {
    public static void main(String[] args) throws IOException {
        File bestand = new File(System.getProperty("java.io.tmpdir"), "buffered-demo.txt");

        // Schrijven met buffer: de BufferedWriter "wikkelt" de FileWriter in
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(bestand))) {
            writer.write("Regel 1: gebufferd schrijven is snel.");
            writer.newLine(); // beter dan "\n": werkt op elk platform
            writer.write("Regel 2: newLine() kiest zelf de juiste regelovergang.");
            writer.newLine();
            writer.write("Regel 3: einde van de demo.");
        } // close() leegt automatisch de buffer (flush)

        // Lezen per regel met readLine()
        System.out.println("Inhoud van " + bestand.getName() + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(bestand))) {
            String regel;
            while ((regel = reader.readLine()) != null) { // null = einde bestand
                System.out.println("  " + regel);
            }
        }

        bestand.delete(); // opruimen
    }
}
