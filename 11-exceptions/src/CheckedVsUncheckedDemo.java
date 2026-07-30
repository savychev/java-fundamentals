import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Demo: CHECKED versus UNCHECKED exceptions.
 * - Checked (subklassen van Exception, behalve RuntimeException):
 *   de compiler dwingt vangen of 'throws' af. Voorbeeld: IOException.
 * - Unchecked (RuntimeException en subklassen): geen compilerplicht.
 *   Voorbeeld: ArithmeticException, NullPointerException.
 */
public class CheckedVsUncheckedDemo {

    public static void main(String[] args) {
        // 1) CHECKED: zonder try/catch of 'throws' compileert dit niet.
        try {
            FileInputStream fis = new FileInputStream("bestaat-niet.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked gevangen: " + e.getClass().getSimpleName());
        }

        // 2) UNCHECKED: de compiler zegt niets, maar runtime gaat het mis.
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked gevangen: " + e.getClass().getSimpleName());
        }
    }
}
