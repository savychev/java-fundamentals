import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Demo: een CHECKED exception doorgeven met 'throws'.
 * FileInputStream kan FileNotFoundException gooien; omdat we hier niet
 * vangen, MOET de methode dat in zijn signatuur declareren.
 */
public class CheckExceptions {

    public static void main(String[] args) throws FileNotFoundException {
        String pad = "C:\tmp\bestaat-niet.txt";

        // Zonder try/catch dwingt de compiler de 'throws'-declaratie af.
        FileInputStream fis = new FileInputStream(pad);
        System.out.println("Bestand geopend: " + fis);
    }
}
