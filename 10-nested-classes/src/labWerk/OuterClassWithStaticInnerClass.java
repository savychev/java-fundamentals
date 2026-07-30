package labWerk;

/**
 * Outer class met een statische geneste (static nested) class.
 * Een static nested class heeft GEEN toegang tot de instantievelden
 * van de outer class; daarom heeft MathFunctionsStatic eigen velden a en b.
 */
public class OuterClassWithStaticInnerClass {
    int a;
    int b;

    /**
     * Static nested class: kan zonder instantie van de outer class
     * aangemaakt worden (new OuterClassWithStaticInnerClass.MathFunctionsStatic()).
     */
    public static class MathFunctionsStatic implements MyMath {
        private int a;
        private int b;

        public MathFunctionsStatic() {
        }

        public MathFunctionsStatic(int a, int b) {
            this.a = a;
            this.b = b;
        }

        // Varianten zonder parameters: werken op de eigen velden.
        int sum() {
            return a + b;
        }

        int min() {
            return Math.min(a, b);
        }

        int max() {
            return Math.max(a, b);
        }

        // Overloaded varianten met parameters: negeren de velden.
        int sum(int a, int b) {
            return a + b;
        }

        int min(int a, int b) {
            return Math.min(a, b);
        }

        int max(int a, int b) {
            return Math.max(a, b);
        }

        @Override
        public double product() {
            return a * b;
        }

        @Override
        public double division() {
            return (double) a / b;
        }
    }
}
