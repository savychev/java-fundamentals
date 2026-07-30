package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Concept: java.nio.file.Files — de moderne "gereedschapskist" voor bestanden.
 *
 * - Files.write(...)        : schrijft een hele lijst regels in EEN oproep.
 * - Files.readAllLines(...) : leest het hele bestand in een List<String>.
 * - Files.readString / writeString bestaan ook (sinds Java 11).
 * - Ideaal voor kleine tot middelgrote bestanden; voor gigantische bestanden
 *   gebruik je beter een stream (Files.lines) of een BufferedReader.
 */
public class NioFilesVoorbeeld {
    public static void main(String[] args) throws IOException {
        Path pad = Paths.get(System.getProperty("java.io.tmpdir"), "nio-demo.txt");

        // Schrijven: hele lijst in een keer, geen writer of loop nodig
        List<String> boodschappen = List.of("melk", "brood", "kaas", "koffie");
        Files.write(pad, boodschappen);
        System.out.println("Geschreven naar: " + pad);

        // Lezen: hele bestand in een keer als lijst van regels
        List<String> gelezen = Files.readAllLines(pad);
        System.out.println("Boodschappenlijst (" + gelezen.size() + " items):");
        for (String item : gelezen) {
            System.out.println("  - " + item);
        }

        // Handige extraatjes van Files
        System.out.println("Grootte in bytes: " + Files.size(pad));
        System.out.println("Leesbaar?         " + Files.isReadable(pad));

        Files.delete(pad); // opruimen
    }
}
