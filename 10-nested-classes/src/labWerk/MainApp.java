package labWerk;

public class MainApp {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.setA(1);
        outer.setB(2);

        OuterClass.MathFunctions mathFunctions = outer.new MathFunctions();
        System.out.println("non-static Min: " + mathFunctions.min());
        System.out.println("non-static Max: " + mathFunctions.max());
        System.out.println("non-static Sum: " + mathFunctions.sum());
        System.out.println("non-static Product: " + mathFunctions.product());
        System.out.println("non-static Division: " + mathFunctions.division());

        System.out.println(" - - - ");

        OuterClassWithStaticInnerClass.MathFunctionsStatic inner = new OuterClassWithStaticInnerClass.MathFunctionsStatic();
        System.out.println("static met parameters Min: " + inner.min(3, 4));
        System.out.println("static met parameters Max: " + inner.max(3, 4));
        System.out.println("static met parameters Sum: " + inner.sum(3, 4));
//        System.out.println("static met parameters Product: " + inner.product(3, 4)); // geen toegang
//        System.out.println("static met parameters Sum: " + inner.sum(3, 4)); // geen toegang

        System.out.println(" - - - ");

        OuterClassWithStaticInnerClass.MathFunctionsStatic innerWithArguments = new OuterClassWithStaticInnerClass.MathFunctionsStatic(3, 4);
        System.out.println("static zonder parameters Min: " + innerWithArguments.min());
        System.out.println("static zonder parameters Max: " + innerWithArguments.max());
        System.out.println("static zonder parameters Sum: " + innerWithArguments.sum());
        System.out.println("static zonder parameters Product: " + innerWithArguments.product());
        System.out.println("static zonder parameters Division: " + innerWithArguments.division());
    }
}
