package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Concept: Scanner op een bestand.
 *
 * - Scanner kent zowel System.in als bestanden als bron.
 * - Sterk punt: PARSEN tijdens het lezen — nextInt(), nextDouble(), next()...
 * - hasNextLine()/hasNextInt() controleer je ALTIJD voor je leest,
 *   anders krijg je een NoSuchElementException.
 */
public class ScannerUitBestand {
    public static void main(String[] args) throws IOException {
        Path pad = Paths.get(System.getProperty("java.io.tmpdir"), "scanner-demo.txt");

        // Testbestand met gemengde data: naam en score per regel
        Files.write(pad, List.of(
                "Alina 87",
                "Bram 92",
                "Chadia 78"
        ));

        // Scanner leest en parseert tegelijk
        int totaal = 0;
        int aantal = 0;
        try (Scanner scanner = new Scanner(pad)) {
            while (scanner.hasNext()) {
                String naam = scanner.next();   // leest een woord
                int score = scanner.nextInt();  // parseert meteen naar int
                System.out.println(naam + " haalde " + score + " punten");
                totaal += score;
                aantal++;
            }
        }
        System.out.println("Gemiddelde: " + (double) totaal / aantal);

        Files.delete(pad); // opruimen
    }
}
