package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Concept: toevoegen (append) aan een bestaand bestand.
 *
 * - Standaard OVERSCHRIJFT een writer het bestand volledig.
 * - new FileWriter(bestand, true)  -> tweede argument 'true' = append-modus.
 * - Met NIO: Files.write(..., StandardOpenOption.APPEND).
 * - Typisch gebruik: logbestanden waar je regels blijft bijschrijven.
 */
public class ToevoegenAanBestand {
    public static void main(String[] args) throws IOException {
        File logBestand = new File(System.getProperty("java.io.tmpdir"), "append-demo.log");

        // Eerste keer schrijven (overschrijft / maakt aan)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logBestand))) {
            writer.write("[INFO] Applicatie gestart");
            writer.newLine();
        }

        // Toevoegen met FileWriter in append-modus (tweede argument = true)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logBestand, true))) {
            writer.write("[INFO] Gebruiker ingelogd");
            writer.newLine();
        }

        // Toevoegen met NIO en StandardOpenOption.APPEND
        Files.write(logBestand.toPath(),
                List.of("[WARN] Schijfruimte bijna vol"),
                StandardOpenOption.APPEND);

        // Resultaat tonen: alle drie de regels staan er nu
        System.out.println("Inhoud van het logbestand:");
        for (String regel : Files.readAllLines(Paths.get(logBestand.getPath()))) {
            System.out.println("  " + regel);
        }

        logBestand.delete(); // opruimen
    }
}
