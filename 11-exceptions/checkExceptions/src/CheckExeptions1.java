import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExeptions1 {

    public static void main(String[] args) throws FileNotFoundException {
        String a = "C:\\Users\\Hilal\\Downloads\\ErvaringsWeek1";

        try {
            FileInputStream fls = new FileInputStream(a);
            System.out.println("Je hebt deze bestand.");
        } catch (FileNotFoundException e) {
            System.out.println("Deze bestand bestaat niet.");

            throw new RuntimeException(e);
        }

    }
}
