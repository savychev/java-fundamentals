import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Demo: een CHECKED exception zelf afhandelen met try/catch,
 * en daarna omzetten (wrappen) naar een unchecked RuntimeException.
 */
public class CheckExceptions1 {

    public static void main(String[] args) {
        String pad = "C:\tmp\bestaat-niet.txt";

        try {
            FileInputStream fis = new FileInputStream(pad);
            System.out.println("Je hebt dit bestand.");
        } catch (FileNotFoundException e) {
            System.out.println("Dit bestand bestaat niet.");

            // Wrappen: de oorspronkelijke exception blijft als 'cause' bewaard.
            throw new RuntimeException(e);
        }
    }
}
