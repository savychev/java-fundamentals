/**
 * Demo: NumberFormatException (unchecked) bij het parsen van tekst.
 * Ongeldige invoer opvangen en netjes melden in plaats van crashen.
 */
public class NumberFormatExceptions {

    public static void main(String[] args) {
        String[] invoer = {"42", "3.14", "veertig"};

        for (String tekst : invoer) {
            try {
                int getal = Integer.parseInt(tekst); // gooit NumberFormatException bij "3.14" en "veertig"
                System.out.println(tekst + " -> " + getal);
            } catch (NumberFormatException e) {
                System.out.println(tekst + " -> geen geldig geheel getal (" + e.getMessage() + ")");
            }
        }
    }
}
