import java.io.*;
import java.nio.file.*;

/*
 * Labo-opdracht: bestanden en mappen aanmaken, tekst schrijven en teruglezen,
 * en een eenvoudig object naar een bestand serialiseren als tekst (CSV-stijl).
 * Alles gebeurt in de tijdelijke map van het systeem, zodat er niets in de repo achterblijft.
 */

class Animal {
    String name;
    boolean edible;

    public Animal(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }

    @Override
    public String toString() {
        return name + "," + edible;
    }

    public static Animal fromString(String data) {
        String[] parts = data.split(",");
        String name = parts[0];
        boolean edible = Boolean.parseBoolean(parts[1]);
        return new Animal(name, edible);
    }
}


public class LabWerk {
    public static void main(String[] args) {
        String myName = "Dimitri";
        String teacherName = "Hilal";

        // Werkmap in de tijdelijke map van het systeem (geen rommel in de repo)
        Path folderPath = Paths.get(System.getProperty("java.io.tmpdir"),
                "labWerk", "From" + myName + "To" + teacherName);
        Path messagePath = folderPath.resolve("message.txt");
        Path animalPath = folderPath.resolve("animal.txt");

        try {
            // Map aanmaken (inclusief tussenliggende mappen)
            if (!Files.exists(folderPath)) {
                Files.createDirectories(folderPath);
                System.out.println("Folder aangemaakt: " + folderPath);
            }

            // Bestanden aanmaken
            if (!Files.exists(messagePath)) {
                Files.createFile(messagePath);
                System.out.println("File aangemaakt: " + messagePath);
            }

            if (!Files.exists(animalPath)) {
                Files.createFile(animalPath);
                System.out.println("File aangemaakt: " + animalPath);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Schrijven naar message.txt
        try (FileWriter fw = new FileWriter(messagePath.toFile());
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Wist je dat katten soms dromen over muizen?\n");
            bw.write("Of misschien over wereldheerschappij... :)");
            System.out.println("Bericht geschreven naar message.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lezen uit message.txt
        try (FileReader fr = new FileReader(messagePath.toFile());
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            System.out.println("Inhoud van message.txt:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Object aanmaken dat we willen opslaan
        Animal mijnDier = new Animal("Kat", false);

        // Object wegschrijven naar animal.txt
        try (FileWriter fw = new FileWriter(animalPath.toFile());
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(mijnDier.toString()); // schrijft de string "Kat,false"
            System.out.println("Dier opgeslagen in animal.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Het dier terug inlezen uit animal.txt
        try (FileReader fr = new FileReader(animalPath.toFile());
             BufferedReader br = new BufferedReader(fr)) {

            String data = br.readLine(); // eerste regel lezen
            Animal gelezenDier = Animal.fromString(data); // object opnieuw opbouwen uit de string
            System.out.println("Gelezen dier:");
            System.out.println("Naam: " + gelezenDier.name);
            System.out.println("Eetbaar: " + gelezenDier.edible);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
