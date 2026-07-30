/**
 * Demo: meerdere catch-blokken en multi-catch.
 * - Catch-volgorde: specifieke exceptions eerst, algemenere later.
 * - Multi-catch (A | B e): een blok voor meerdere types tegelijk.
 */
public class ExceptionsCatch {

    public static void main(String[] args) {
        // 1) Meerdere catch-blokken: van specifiek naar algemeen.
        try {
            int[] cijfers = new int[3];
            cijfers[5] = 1; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Specifiek: index buiten bereik");
        } catch (RuntimeException e) {
            System.out.println("Algemener: een andere runtime-fout");
        }

        // 2) Multi-catch: NumberFormatException OF ArithmeticException.
        for (String invoer : new String[]{"abc", "0"}) {
            try {
                int getal = Integer.parseInt(invoer); // kan NumberFormatException gooien
                System.out.println(100 / getal);      // kan ArithmeticException gooien
            } catch (NumberFormatException | ArithmeticException e) {
                // 'e' is hier impliciet final; een blok voor beide gevallen.
                System.out.println("Multi-catch ving: " + e.getClass().getSimpleName());
            }
        }
    }
}
