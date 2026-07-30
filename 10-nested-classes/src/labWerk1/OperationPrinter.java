package labWerk1;

/**
 * Hulpklasse die alle bewerkingen van een {@link ArithmeticOperations}
 * afdrukt. Werkt via het interface, dus onafhankelijk van de concrete
 * (inner) class erachter.
 */
public class OperationPrinter {

    public static void displayAllOperations(ArithmeticOperations ops, String title) {
        System.out.println("\n=== " + title + " ===");
        System.out.println("Min:      " + ops.min());
        System.out.println("Max:      " + ops.max());
        System.out.println("Sum:      " + ops.sum());
        System.out.println("Product:  " + ops.product());
        System.out.println("Division: " + ops.division());
    }
}
