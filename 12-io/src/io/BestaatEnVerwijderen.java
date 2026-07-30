package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Concept: controleren of een bestand bestaat en het veilig verwijderen.
 *
 * - Files.exists(pad)          : bestaat het bestand of de map?
 * - Files.createFile(pad)      : gooit een exception als het al bestaat.
 * - Files.delete(pad)          : gooit NoSuchFileException als het NIET bestaat.
 * - Files.deleteIfExists(pad)  : veilige variant, geeft boolean terug.
 */
public class BestaatEnVerwijderen {
    public static void main(String[] args) throws IOException {
        Path pad = Paths.get(System.getProperty("java.io.tmpdir"), "exists-demo.txt");

        // 1. Controleren voor we iets doen
        System.out.println("Bestaat vooraf?        " + Files.exists(pad));

        // 2. Alleen aanmaken als het nog niet bestaat
        if (!Files.exists(pad)) {
            Files.createFile(pad);
            System.out.println("Bestand aangemaakt:    " + pad);
        }
        System.out.println("Bestaat nu?            " + Files.exists(pad));

        // 3. Veilig verwijderen: deleteIfExists gooit GEEN exception
        //    als het bestand er niet (meer) is
        boolean verwijderd = Files.deleteIfExists(pad);
        System.out.println("Verwijderd?            " + verwijderd);

        // 4. Nog eens proberen: nu is er niets meer te verwijderen
        boolean nogEens = Files.deleteIfExists(pad);
        System.out.println("Tweede keer verwijderd? " + nogEens + " (er was niets meer)");
    }
}
