package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Concept: FileWriter en FileReader.
 *
 * - FileWriter/FileReader werken met KARAKTERS (tekst), niet met bytes.
 * - Ze zijn ONgebufferd: elke write/read kan direct naar de schijf gaan.
 *   Voor grotere bestanden wikkel je ze daarom in Buffered-varianten
 *   (zie BufferedReaderWriterVoorbeeld).
 */
public class FileWriterFileReaderVoorbeeld {
    public static void main(String[] args) throws IOException {
        File bestand = new File(System.getProperty("java.io.tmpdir"), "filewriter-demo.txt");

        // Schrijven: FileWriter maakt het bestand aan (of overschrijft het)
        try (FileWriter writer = new FileWriter(bestand)) {
            writer.write("Hallo vanuit FileWriter!\n");
            writer.write("Tweede regel tekst.\n");
        }
        System.out.println("Geschreven naar: " + bestand.getAbsolutePath());

        // Lezen: FileReader leest karakter per karakter (read() geeft int terug!)
        System.out.println("Inhoud:");
        try (FileReader reader = new FileReader(bestand)) {
            int teken;
            while ((teken = reader.read()) != -1) { // -1 betekent: einde van het bestand
                System.out.print((char) teken);
            }
        }

        // Opruimen zodat de tijdelijke map netjes blijft
        bestand.delete();
    }
}
