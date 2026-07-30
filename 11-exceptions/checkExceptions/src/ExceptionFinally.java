/**
 * Demo: semantiek van 'finally'.
 * Het finally-blok draait ALTIJD: na een normale afloop, na een gevangen
 * exception en zelfs na een return in het try-blok.
 */
public class ExceptionFinally {

    public static void main(String[] args) {
        System.out.println("Resultaat: " + deel(10, 2)); // normaal pad
        System.out.println("Resultaat: " + deel(10, 0)); // exception-pad
    }

    static int deel(int a, int b) {
        try {
            int uitkomst = a / b; // gooit ArithmeticException als b == 0
            return uitkomst;      // ook bij deze return draait finally nog
        } catch (ArithmeticException e) {
            System.out.println("Delen door nul; we geven -1 terug.");
            return -1;
        } finally {
            // Draait altijd: ideaal voor opruimwerk (resources sluiten enz.).
            System.out.println("finally: wordt altijd uitgevoerd");
        }
    }
}
