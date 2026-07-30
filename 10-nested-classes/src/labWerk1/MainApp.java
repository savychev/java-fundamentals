package labWerk1;

/**
 * Demo: beide inner-class-varianten achter hetzelfde interface.
 * Dankzij polymorfisme drukt OperationPrinter ze identiek af.
 */
public class MainApp {

    public static void main(String[] args) {
        // Niet-statische inner class: eerst een outer-instantie nodig.
        OuterClass outer = new OuterClass();
        outer.setA(1);
        outer.setB(2);
        ArithmeticOperations obj1 = outer.new MathFunctions();
        OperationPrinter.displayAllOperations(obj1, "Non-static Inner Class");

        // Static nested class: direct aanmaken via de outer-classnaam.
        ArithmeticOperations obj2 = new OuterClassWithStaticInnerClass.MathFunctionsStatic(10, 20);
        OperationPrinter.displayAllOperations(obj2, "Static Inner Class");
    }
}
