package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Concept: basis van File en Path.
 *
 * - java.io.File is de oude (klassieke) manier om een bestand of map voor te stellen.
 * - java.nio.file.Path is de moderne variant (sinds Java 7) en werkt samen met Files.
 * - Een File/Path-object is alleen een VERWIJZING naar een locatie:
 *   het bestand hoeft nog niet te bestaan!
 */
public class BestandEnPadBasis {
    public static void main(String[] args) throws IOException {
        // Tijdelijke map van het besturingssysteem — hier mogen we vrij schrijven
        String tmp = System.getProperty("java.io.tmpdir");
        System.out.println("Tijdelijke map: " + tmp);

        // --- Oude stijl: java.io.File ---
        File file = new File(tmp, "voorbeeld-file.txt");
        System.out.println("Naam:            " + file.getName());
        System.out.println("Absoluut pad:    " + file.getAbsolutePath());
        System.out.println("Bestaat al?      " + file.exists());
        System.out.println("Is map?          " + file.isDirectory());

        // --- Moderne stijl: java.nio.file.Path ---
        Path pad = Paths.get(tmp, "submap", "voorbeeld-pad.txt");
        System.out.println("Bestandsnaam:    " + pad.getFileName());
        System.out.println("Bovenliggende:   " + pad.getParent());
        System.out.println("Aantal delen:    " + pad.getNameCount());

        // Paden combineren doe je met resolve() in plaats van string-plakwerk
        Path basis = Paths.get(tmp);
        Path samengesteld = basis.resolve("data").resolve("bestand.txt");
        System.out.println("Samengesteld:    " + samengesteld);
    }
}
