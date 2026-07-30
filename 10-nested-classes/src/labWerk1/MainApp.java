package labWerk1;

public class MainApp {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.setA(1);
        outer.setB(2);
        ArithmeticOperations obj1 = outer.new MathFunctions();
        OperationPrinter.displayAllOperations(obj1, "Non-static Inner Class");

        ArithmeticOperations obj2 = new OuterClassWithStaticInnerClass.MathFunctionsStatic(10, 20);
        OperationPrinter.displayAllOperations(obj2, "Static Inner Class");
    }
}
