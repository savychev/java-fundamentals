package labWerk1;

/**
 * Gemeenschappelijk contract voor de rekenkundige bewerkingen,
 * zodat beide inner-class-varianten op dezelfde manier gebruikt
 * kunnen worden (zie {@link OperationPrinter}).
 */
public interface ArithmeticOperations {
    int min();
    int max();
    int sum();
    int product();
    double division();
}
