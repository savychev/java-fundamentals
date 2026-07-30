import java.io.*;
import java.nio.file.*;

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

        Path folderPath = Paths.get("C:\\Users\\fjdsi\\Downloads\\labWerk/From" + myName + "To" + teacherName);
        Path messagePath = folderPath.resolve("message.txt");
        Path animalPath = folderPath.resolve("animal.txt");

        try {
            // create folder
            if (!Files.exists(folderPath)) {
                Files.createDirectories(folderPath);
                System.out.println("Folder aangemaakt: " + folderPath);
            }

            // create files
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

        // write to message.txt
        try (FileWriter fw = new FileWriter(messagePath.toFile());
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Wist je dat katten soms dromen over muizen?\n");
            bw.write("Of misschien over wereldheerschappij... 😼");
            System.out.println("Bericht geschreven naar message.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // read from message.txt
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

        // create object from animal.txt
        Animal mijnDier = new Animal("Kat", false);

        // write object to animal.txt
        try (FileWriter fw = new FileWriter(animalPath.toFile());
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(mijnDier.toString()); // write a string "Kat,false"
            System.out.println("Dier opgeslagen in animal.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Lees het dier terug uit animal.txt ---
        try (FileReader fr = new FileReader(animalPath.toFile());
             BufferedReader br = new BufferedReader(fr)) {

            String data = br.readLine(); // read the first line
            Animal gelezenDier = Animal.fromString(data); // create an object from string
            System.out.println("Gelezen dier:");
            System.out.println("Naam: " + gelezenDier.name);
            System.out.println("Eetbaar: " + gelezenDier.edible);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
