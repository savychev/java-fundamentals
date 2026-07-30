/**
 * Demo: ArithmeticException (unchecked) bij delen door nul,
 * met een finally-blok dat altijd draait.
 */
public class ArithmeticExceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b; // gooit ArithmeticException: delen door nul
            System.out.println(c); // wordt overgeslagen
        } catch (ArithmeticException e) {
            System.out.println("Het getal kan niet nul zijn!");
        } finally {
            // Draait altijd, ook als er geen exception was geweest.
            System.out.println("Finally-blok werkt!");
        }
        System.out.println("Het programma gaat gewoon verder.");
    }
}
