/**
 * Demo: NumberFormatException bij Integer.parseInt met ongeldige tekst.
 * Laat ook zien wat e.printStackTrace() en e.getMessage() opleveren.
 */
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        int a;
        try {
            a = Integer.parseInt("HALLO"); // geen getal: gooit NumberFormatException
            System.out.println("A is: " + a);
        } catch (NumberFormatException e) {
            e.printStackTrace(); // volledige stacktrace naar System.err
//            System.out.println("Message: " + e.getMessage()); // alleen de boodschap
//            System.out.println("Message: " + e.toString());   // klasse + boodschap
            System.out.println("Code werkt gewoon verder!");
        }
    }
}
