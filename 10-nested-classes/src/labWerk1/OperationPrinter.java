package labWerk1;

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
